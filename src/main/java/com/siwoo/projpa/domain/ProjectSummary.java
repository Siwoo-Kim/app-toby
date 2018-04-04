package com.siwoo.projpa.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.*;

@Getter @Setter @ToString
public class ProjectSummary implements Serializable{

    private String name;
    private Project.Type type;
    private List<String> sectionNames = new ArrayList<>();
    private Map<String, String[]> documentTitles = new HashMap<>();

    public ProjectSummary() {}

    public ProjectSummary(String name, Project.Type type) {
        this.name = name;
        this.type = type;
    }

    public ProjectSummary(String name, Project.Type type, List<String> sectionNames, Map<String,String[]> documentTitles) {
        this.name = name;
        this.type = type;
        this.sectionNames = sectionNames;
        this.documentTitles = documentTitles;
    }

}

