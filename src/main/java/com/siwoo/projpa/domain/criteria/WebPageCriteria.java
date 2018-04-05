package com.siwoo.projpa.domain.criteria;

import com.siwoo.projpa.domain.Name;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@Getter @ToString
public class WebPageCriteria {

    public enum Search {
        NAME, DESCRIPTION, URL, PUBLIC
    }

    Set<Search> searches;
    public String name;
    public String description;
    public URL url;
    public Boolean isPublic;

    public WebPageCriteria(String name, String description, URL url, Boolean isPublic) {
        this.searches = new HashSet<>();
        if(StringUtils.hasText(name)) {
            this.name = name;
            this.searches.add(Search.NAME);
        }
        if(StringUtils.hasText(description)) {
            this.description = description;
            this.searches.add(Search.DESCRIPTION);
        }
        if(!ObjectUtils.isEmpty(url)) {
            this.url = url;
            this.searches.add(Search.URL);
        }
        if(!ObjectUtils.isEmpty(isPublic)){
            this.isPublic = isPublic;
            this.searches.add(Search.PUBLIC);
        }
        log.info(this.toString());
        CriteriaSupporter.throwIfSizeNotMatches(WebPageCriteria.class,this.searches, name, description, url, isPublic);
    }
}
