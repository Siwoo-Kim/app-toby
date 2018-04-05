package com.siwoo.projpa.service;


import com.siwoo.projpa.domain.WebPage;
import com.siwoo.projpa.domain.criteria.WebPageCriteria;
import com.siwoo.projpa.repository.WebPageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.siwoo.projpa.service.support.ServiceSupporter.throwIfEmpty;
import static com.siwoo.projpa.service.support.ServiceSupporter.throwIfNull;

@Slf4j
@Service
public class WebPageServiceImpl implements WebPageService {

    @Autowired
    WebPageRepository webPageRepository;

    @Override
    public List<WebPage> get() {
        return webPageRepository.findAll();
    }

    @Override
    public List<WebPage> getByCriteriaAny(WebPageCriteria criteria) {
        throwIfNull(criteria);
        return webPageRepository.findByCriteriaMatchAny(criteria);
    }

    @Override
    public WebPage get(String name) {
        throwIfEmpty(name);
        return webPageRepository.findByName(name);
    }

}
