package com.siwoo.projpa.service;

import com.siwoo.projpa.domain.Section;
import com.siwoo.projpa.domain.criteria.SectionCriteria;

import java.util.List;

public interface SectionService {

    List<Section> search(SectionCriteria sectionCriteria);
}
