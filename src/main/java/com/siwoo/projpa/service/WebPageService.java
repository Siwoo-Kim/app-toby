package com.siwoo.projpa.service;

import com.siwoo.projpa.domain.WebPage;
import com.siwoo.projpa.domain.criteria.WebPageCriteria;
import com.siwoo.projpa.repository.WebPageRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional(readOnly = true)
public interface WebPageService {


    List<WebPage> get();

    List<WebPage> getByCriteriaAny(WebPageCriteria criteria);

    WebPage get(String name);
}
