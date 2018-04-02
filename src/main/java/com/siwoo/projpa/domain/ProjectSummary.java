package com.siwoo.projpa.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter @Setter @ToString
public class ProjectSummary implements Serializable{

    private String name;
    private Project.Type type;
    private Set<String> sectionNames = new HashSet<>();
    private Set<String> documentTitles = new HashSet<>();

    public ProjectSummary() {}

    public ProjectSummary(String name, Project.Type type) {
        this.name = name;
        this.type = type;
    }

    public ProjectSummary(String name, Project.Type type, Set<String> sectionNames, Set<String> documentTitles) {
        this.name = name;
        this.type = type;
        this.sectionNames = sectionNames;
        this.documentTitles = documentTitles;
    }

}

