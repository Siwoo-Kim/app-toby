package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.Project;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository @Slf4j
public class ProjectRepositoryImpl implements CustomProjectRepository {

    @PersistenceContext
    EntityManager entityManager;
    private final static Class<Project> domainClass = Project.class;

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



}
