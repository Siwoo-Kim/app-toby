package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.Project;
import com.siwoo.projpa.domain.ProjectSummary;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface CustomProjectRepository {
    List<Project> getByNames(List<String> names);
    List<Project> getByNames(String... names);
    ProjectSummary getProjectSummary(long projectId);
}
