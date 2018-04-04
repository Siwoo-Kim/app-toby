package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.Project;
import com.siwoo.projpa.domain.Section;
import com.siwoo.projpa.domain.SectionSummary;
import com.siwoo.projpa.domain.criteria.SectionCriteria;

import java.util.List;

public interface CustomSectionRepository {

    List<Section> findCriteriaMatchALL(SectionCriteria sectionCriteria);

    //List<Section> findSectionByProjects(Project... projects);

    List<Section> findCriteriaMatchAny(SectionCriteria sectionCriteria);

    List<Section> findByProject(long projectId);

    SectionSummary findSectionSummary(long id);
}
