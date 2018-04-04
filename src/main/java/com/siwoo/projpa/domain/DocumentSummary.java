package com.siwoo.projpa.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class DocumentSummary {

    private String title;
    private String subtitle;
    private String description;
    private BasicTime basicTime;

    protected DocumentSummary(){}

    public DocumentSummary(String title, String subtitle, String description, BasicTime basicTime) {
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.basicTime = basicTime;
    }
}
