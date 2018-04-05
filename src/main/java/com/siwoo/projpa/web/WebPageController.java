package com.siwoo.projpa.web;

import com.siwoo.projpa.domain.WebPage;
import com.siwoo.projpa.domain.criteria.WebPageCriteria;
import com.siwoo.projpa.service.WebPageService;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/webpage")
public class WebPageController {

    @Autowired
    WebPageService webPageService;

    @GetMapping
    List<WebPage> list() {
        return webPageService.get();
    }

    @Getter @Setter @ToString
    private static class WebPageParams {
        public String name;
        public String description;
        public URL url;
        public Boolean isPublic;
    }

    @GetMapping("/search")
    List<WebPage> search(@ModelAttribute WebPageParams webPageParams){
        log.warn(webPageParams + "");
        return webPageService.getByCriteriaAny(
                new WebPageCriteria(
                        webPageParams.getName(),
                        webPageParams.getDescription(),
                        webPageParams.getUrl(),
                        webPageParams.getIsPublic()));
    }

    @GetMapping("/{name}")
    WebPage get(@PathVariable("name") String name) {
        return webPageService.get(name);
    }
}
