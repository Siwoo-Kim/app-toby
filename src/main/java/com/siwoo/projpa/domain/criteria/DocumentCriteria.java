package com.siwoo.projpa.domain.criteria;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@AllArgsConstructor
@Getter @Setter @ToString
public class DocumentCriteria {

    public enum Search {
        TITLE, SUBTITLE, DESCRIPTION, CONTENT;
    }

    Set<Search> searches;
    private final String title;
    private final String subtitle;
    private final String description;
    private final String content;

    public DocumentCriteria(String title, String subtitle, String description, String content, Search... searches) {
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.content = content;
        this.searches = new HashSet<Search>(Arrays.asList(searches));
        //log.warn(this.searches+"");
    }

}
