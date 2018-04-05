package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.WebPage;
import com.siwoo.projpa.domain.criteria.WebPageCriteria;
import com.siwoo.projpa.domain.support.CriteriaException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

import static com.siwoo.projpa.repository.WebPageRepository.*;
import static com.siwoo.projpa.domain.criteria.WebPageCriteria.*;
import static com.siwoo.projpa.repository.support.RepositorySupport.*;
import static com.siwoo.projpa.service.support.ServiceSupporter.*;

@Slf4j
@Repository
public class WebPageRepositoryImpl implements CustomWebPageRepository {


    @PersistenceContext
    EntityManager entityManager;
    private static final Class<WebPage> DOMAIN_CLASS = WebPage.class;

    @Override
    public List<WebPage> findByCriteriaMatchAny(WebPageCriteria webPageCriteria) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<WebPage> query = cb.createQuery(DOMAIN_CLASS);
        Root<WebPage> webPageRoot = query.from(DOMAIN_CLASS);
        webPageRoot.fetch(COLUMN_IMGNAMES);
        query.select(webPageRoot).distinct(true);

        Predicate criteria = cb.disjunction();
        for (Search search : webPageCriteria.getSearches()) {
            switch (search) {
                case DESCRIPTION: {
                    criteria = cb.or(criteria,
                            cb.like(cb.upper(webPageRoot.get(COLUMN_DESCRIPTION)),
                                    surround(webPageCriteria.getDescription().toUpperCase(), "%")));
                    break;
                }
                case NAME: {
                    log.warn( surround(webPageCriteria.getName(), "%"));
                    criteria = cb.or(criteria,
                            cb.like(cb.upper(webPageRoot.get(COLUMN_NAME)),
                                    surround(webPageCriteria.getName().toUpperCase(), "%")));
                    break;
                }
                case URL: {
                    criteria = cb.or(criteria, cb.
                            equal(webPageRoot.get(COLUMN_URL), webPageCriteria.getUrl()));
                    break;
                }
                case PUBLIC: {
                    criteria = cb.or(criteria,
                            cb.equal(webPageRoot.get(COLUMN_ISPUBLIC), webPageCriteria.getIsPublic()));
                    break;
                }
                default:
                    throw new CriteriaException("Unknown Value Search[" + search + "]", "error.notFound.criteria.search");
            }
        }
        log.info(webPageCriteria + "");
        return entityManager.createQuery(query.where(criteria)).getResultList();
    }
}
