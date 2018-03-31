package com.siwoo.projpa.service;

import com.siwoo.projpa.domain.BasicTime;
import com.siwoo.projpa.domain.Project;
import com.siwoo.projpa.domain.User;
import com.siwoo.projpa.repository.ProjectRepository;
import com.siwoo.projpa.repository.SectionRepository;
import com.siwoo.projpa.repository.UserRepository;
import com.siwoo.projpa.service.support.ServiceArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired UserRepository userRepository;
    @Autowired ProjectRepository projectRepository;
    @Autowired
    SectionRepository sectionRepository;
    @Autowired AuditService auditService;

    @Override
    public void assign(Project project, User user) {
        Optional<User> foundUser = userRepository.findById(user.getId());
        Optional<Project> foundProject = projectRepository.findById(project.getId());
        if(!foundUser.isPresent() || !foundProject.isPresent()) {
            throw new ServiceArgumentException("Argument is invalid");
        }
        project = foundProject.get();
        user = foundUser.get();
        user.addProject(project);
    }

    @Override
    public void create(Project project) {
        defaultValue(project);
        projectRepository.save(project);
    }

    private void defaultValue(Project project) {
        if(project.getBasicTime() == null || project.getBasicTime().getCreated() == null) {
            project.setBasicTime(new BasicTime(LocalDateTime.now(), null));
        }
    }

    @Autowired PlatformTransactionManager platformTransactionManager;

    @Override
    public void updateLastUpdatedSections() {
        TransactionStatus status = platformTransactionManager.getTransaction(new DefaultTransactionAttribute());
        try {
            List<Object[]> rows = sectionRepository.findMaxUpdateTimeAndProjectGroupByProject();
            for (Object[] row : rows) {
                updateLastUpdatedSection((LocalDateTime) row[0], (String) row[1]);
            }
            platformTransactionManager.commit(status);
        }catch (RuntimeException e) {
            platformTransactionManager.rollback(status);
        }
    }

    private void updateLastUpdatedSection(LocalDateTime updateTime, String projectName) {
        Project project = projectRepository.findByName(projectName);
        project.setLastUpdatedSection(updateTime);
        projectRepository.save(project);
    }

}
