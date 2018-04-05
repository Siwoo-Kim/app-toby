package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.WebPage;
import com.siwoo.projpa.domain.criteria.WebPageCriteria;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface CustomWebPageRepository {

    List<WebPage> findByCriteriaMatchAny(WebPageCriteria webPageCriteria);
}
