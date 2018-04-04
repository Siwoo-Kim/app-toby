package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.Document;
import com.siwoo.projpa.domain.Project;
import com.siwoo.projpa.domain.ProjectSummary;
import com.siwoo.projpa.domain.Section;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.*;
import java.util.stream.Collectors;

@Repository @Slf4j
public class ProjectRepositoryImpl implements CustomProjectRepository {

    @PersistenceContext
    EntityManager entityManager;
    private final static Class<Project> domainClass = Project.class;

    @Autowired SectionRepository sectionRepository;
    @Autowired DocumentRepository documentRepository;


    private final static String BY_NAME =
            "select p from Project p where upper(p.name) = upper(:name)";
    private final static String BY_NAME_IN =
            "select p from Project p where upper(p.name) in (:names)";

    @Override
    public List<Project> getByNames(List<String> names) {
        Assert.notEmpty(names,"names must not empty");
        return entityManager.createQuery(BY_NAME_IN, domainClass)
            .setParameter("names", capitalize(names) )
            .getResultList();
    }

    @Override
    public List<Project> getByNames(String... names) {
        return getByNames(Arrays.asList(names));
    }

    private List<String> capitalize(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }


    @Override
    public ProjectSummary getProjectSummary(long projectId) {
        Project project = entityManager.find(domainClass,projectId);
        List<String> sectionNames = sectionRepository.findNameByProjectName(project.getName());
        Map<String, String[]> documentTitles = new HashMap<>();
        for(String sectionName: sectionNames) {
            String[] titles = documentRepository.findTitleBySectionName(sectionName);
            documentTitles.put(sectionName,titles);
        }
        return new ProjectSummary(project.getName(),project.getType(),sectionNames,documentTitles);
    }

}
