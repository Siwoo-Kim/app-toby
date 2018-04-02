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
import org.springframework.util.Assert;

import javax.validation.constraints.AssertTrue;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Function;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired UserRepository userRepository;
    @Autowired ProjectRepository projectRepository;
    @Autowired SectionRepository sectionRepository;
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
        List<Object[]> rows = sectionRepository.findMaxUpdateTimeAndProjectGroupByProject();
        for (Object[] row : rows) {
            updateLastUpdatedSection((LocalDateTime) row[0], (String) row[1]);
        }
    }

    private void updateLastUpdatedSection(LocalDateTime updateTime, String projectName) {
        Project project = projectRepository.findByName(projectName);
        project.setLastUpdatedSection(updateTime);
        projectRepository.save(project);
    }

    @Override
    public void displayProjectUsers(String name) {
        List<User> users = userRepository.findByProjectName(name);
        for(int i=0; i<users.size(); i++) {
            User user = users.get(i);
            System.out.println("Project: " + name);
            System.out.println(i + 1 + ": " + user.getName() + ", "+ user.getEmail());
        }
    }


    @Override
    public Project maxManagerProject() {
        Map<Project,Long> data = countManagers();
        Project max;
        return data.entrySet().stream()
                .max((o1, o2) -> o1.getValue().compareTo(o2.getValue()))
                .map(projectLongEntry -> projectLongEntry.getKey())
                .get();
    }

    @Override
    public Map<Project,Long> countManagers() {
        List<Object[]> rows = projectRepository.findIdAndManagerCount();
        return mappingToMap(rows, id -> projectRepository.findById((Long) id).get());
    }

    @Override
    public List<Project> getAll() {
        return projectRepository.findAll();
    }

    private Map mappingToMap(List<Object[]> rows, Function<Object, Object> doWork) {
        HashMap<Object, Object> map = new HashMap<>();
        for(Object[] row: rows) {
            if(row[0] != null) {
                long id = (long) row[0];
                Object object = doWork.apply(id);
                map.put(object, row[1]);
            }
        }
        return map;
    }
}
