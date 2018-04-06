package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.User;
import com.siwoo.projpa.domain.WebPage;
import com.siwoo.projpa.domain.criteria.WebPageCriteria;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface CustomWebPageRepository {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void updateAuthorBulk(List<WebPage> webPages, User user);

    List<WebPage> findByCriteriaMatchAny(WebPageCriteria webPageCriteria);
}
