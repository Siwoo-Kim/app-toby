package com.siwoo.projpa.domain.criteria;

import com.siwoo.projpa.domain.Project;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@Getter @ToString
public class SectionCriteria {

    public enum Search {
        NAME, DESCRIPTION, DIFFICULTY, PROJECT;
    }

    private Set<Search> searches;
    private String name;
    private String description;
    private Integer difficulty;
    private Project project;

    public SectionCriteria(String name, String description, Integer difficulty,Project project, Search... searches) {
        this.name = name;
        this.description = description;
        this.difficulty = difficulty;
        this.project = project;
        this.searches = new HashSet<>(Arrays.asList(searches));
    }

    public SectionCriteria(String name, String description, Integer difficulty,Project project) {
        searches = new HashSet<>();
        if(StringUtils.hasText(name)) {
            this.name = name;
            this.searches.add(Search.NAME);
        }
        if(StringUtils.hasText(description)) {
            this.description = description;
            this.searches.add(Search.DESCRIPTION);
        }
        if(!ObjectUtils.isEmpty(difficulty)) {
            this.difficulty = difficulty;
            this.searches.add(Search.DIFFICULTY);
        }
        if(!ObjectUtils.isEmpty(project)) {
            this.project = project;
            this.searches.add(Search.PROJECT);
        }
        log.info(this.toString());
        CriteriaSupporter.throwIfSizeNotMatches(WebPageCriteria.class,this.searches, name, description, difficulty, project);
    }
}
