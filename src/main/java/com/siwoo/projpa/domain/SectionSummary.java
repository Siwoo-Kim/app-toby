package com.siwoo.projpa.domain;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter @ToString
public class SectionSummary {
    Section section;
    List<DocumentSummary> documentSummary;

    protected SectionSummary() {}

    public SectionSummary(Section section, List<DocumentSummary> documentSummary) {
        this.section = section;
        this.documentSummary = documentSummary;
    }
}
