package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.Document;
import com.siwoo.projpa.domain.criteria.DocumentCriteria;
import com.siwoo.projpa.service.support.ServiceArgumentException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@Repository
public class DocumentRepositoryImpl implements CustomDocumentRepository {

    @Autowired
    EntityManager entityManager;
    private static final Class<Document> domainClass = Document.class;

    public static final String COLUMN_TITLE = "title";
    public static final String COLUMN_SUBTITLE = "subtitle";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_CONTENT = "content";
    public static final String COLUMN_RESOURCES = "resources";
    public static final String COLUMN_OWNER = "owner";
    public static final String COLUMN_ID = "id";


    @Override
    public List<Document> findByTitle(String title) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Document> query = cb.createQuery(domainClass);
        Root<Document> documentRoot = query.from(domainClass);
        query.select(documentRoot)
                .where(cb.equal(documentRoot.get(COLUMN_TITLE), title));
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<Document> findByCriteria(DocumentCriteria documentCriteria) {
       CriteriaBuilder cb = entityManager.getCriteriaBuilder();
       CriteriaQuery<Document> query = cb.createQuery(domainClass);
       Root<Document> documentRoot = query.from(domainClass);
       //Join<Document,Map<String,URL>> resourceRoot = documentRoot.join(COLUMN_RESOURCES, JoinType.LEFT);
       query.select(documentRoot);
       query.distinct(true);


       List<Predicate> criteria = new ArrayList<>();
       for(DocumentCriteria.Search search: documentCriteria.getSearches()) {
           switch (search) {
               case TITLE: {
                   ParameterExpression<String> parameterExpression = cb.parameter(String.class, COLUMN_TITLE);
                   criteria.add(cb.equal(documentRoot.get(COLUMN_TITLE), parameterExpression));
                   break;
               }
               case SUBTITLE: {
                   ParameterExpression<String> parameterExpression = cb.parameter(String.class, COLUMN_SUBTITLE);
                   criteria.add(cb.equal(documentRoot.get(COLUMN_SUBTITLE), parameterExpression));
                   break;
               }
               case DESCRIPTION: {
                   ParameterExpression<String> parameterExpression = cb.parameter(String.class, COLUMN_DESCRIPTION);
                   criteria.add(cb.equal(documentRoot.get(COLUMN_DESCRIPTION), parameterExpression));
                   break;
               }
               case CONTENT: {
                   ParameterExpression<String> parameterExpression = cb.parameter(String.class, COLUMN_CONTENT);
                   criteria.add(cb.equal(documentRoot.get(COLUMN_CONTENT), parameterExpression));
                   break;
               }
               default: throw new ServiceArgumentException("DocumentCriteria[searches] formed wrongly");
           }
       }

       Predicate[] p = new Predicate[criteria.size()];
       criteria.toArray(p);
       query.where(cb.and(p));

       TypedQuery<Document> typedQuery = entityManager.createQuery(query);
        if(documentCriteria.getTitle() != null) {
            typedQuery.setParameter(COLUMN_TITLE, documentCriteria.getTitle());
        }
        if(documentCriteria.getSubtitle() != null) {
            typedQuery.setParameter(COLUMN_SUBTITLE, documentCriteria.getSubtitle());
        }
        if(documentCriteria.getDescription() != null) {
            typedQuery.setParameter(COLUMN_DESCRIPTION, documentCriteria.getDescription());
        }
        if(documentCriteria.getContent() != null) {
            typedQuery.setParameter(COLUMN_CONTENT, documentCriteria.getContent());
        }
        return typedQuery.getResultList();
    }


    @Override
    public String findTitleById(long id) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<String> query = cb.createQuery(String.class);
        Root<Document> documentRoot = query.from(domainClass);

        query.select(documentRoot.get(COLUMN_TITLE))
             .where(cb.equal(documentRoot.get(COLUMN_ID), id) );
        return entityManager.createQuery(query).getSingleResult();
    }

    @Override
    public List<Document> findByUserId(long userId) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Document> query = cb.createQuery(domainClass);
        Root<Document> documentRoot = query.from(domainClass);

        query.select(documentRoot)
                .distinct(true)
                .where(cb.equal( documentRoot.get( COLUMN_OWNER ).get( UserRepositoryImpl.COLUMN_ID ) , userId ));
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<Document> findByUserEmail(String email) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Document> query = cb.createQuery(domainClass);
        Root<Document> documentRoot = query.from(domainClass);

        query.select(documentRoot)
                .where( cb.equal( documentRoot.get(COLUMN_OWNER).get(UserRepositoryImpl.COLUMN_EMAIL), email) );
        return entityManager
                .createQuery(query)
                .getResultList();
    }


    @Override
    public Tuple findTitleAndSubtitleById(long id) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tuple> query = cb.createTupleQuery();
        Root<Document> documentRoot = root(query);
        query.multiselect(
                documentRoot.get(COLUMN_TITLE).alias(COLUMN_TITLE),
                documentRoot.get(COLUMN_SUBTITLE).alias(COLUMN_SUBTITLE))
                .where(cb.equal( documentRoot.get(COLUMN_ID), id) );
        return entityManager.createQuery(query).getSingleResult();
    }


    public static Root<Document> root(CriteriaQuery<?> query) {
        return query.from(domainClass);
    }
}






























