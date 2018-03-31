package com.siwoo.projpa.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter @Setter @ToString
public class ProjectSummary implements Serializable{

    private String name;
    private Project.Type type;

    public ProjectSummary() {}

    public ProjectSummary(String name, Project.Type type) {
        this.name = name;
        this.type = type;
    }

}

