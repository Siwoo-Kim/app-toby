package com.siwoo.projpa.service;

import com.siwoo.projpa.domain.Project;
import com.siwoo.projpa.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Transactional(readOnly = true)
public interface ProjectService {

    @Transactional(readOnly = false, rollbackFor = RuntimeException.class)
    void assign(Project project, User user);

    @Transactional(readOnly = false)
    void create(Project project);

    @Transactional(readOnly = false)
    void updateLastUpdatedSections();

    void displayProjectUsers(String name);

    Project maxManagerProject();

    Map<Project,Long> countManagers();
}
