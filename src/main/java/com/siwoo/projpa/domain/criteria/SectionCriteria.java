package com.siwoo.projpa.domain.criteria;

import com.siwoo.projpa.domain.Project;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
}
