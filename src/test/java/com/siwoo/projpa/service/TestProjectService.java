package com.siwoo.projpa.service;

import com.siwoo.projpa.FixtureFactory;
import com.siwoo.projpa.domain.Project;
import com.siwoo.projpa.domain.User;
import com.siwoo.projpa.repository.LogRepository;
import com.siwoo.projpa.repository.ProjectRepository;
import com.siwoo.projpa.repository.SectionRepository;
import com.siwoo.projpa.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.proxy.ProxyFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import static junit.framework.TestCase.*;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestProjectService {

    @Autowired
    SectionRepository sectionRepository;
    @Autowired
    ProjectService projectService;
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    LogRepository logRepository;
    @Autowired
    UserRepository userRepository;
    private List<Project> projects;
    private List<User> users;

    @Before
    public void setup() {
        projects = FixtureFactory.projects();
        users = FixtureFactory.users();
        projectRepository.saveAll(projects);
        userRepository.saveAll(users);
    }

    @Test
    public void assign() {
        User user = users.get(0);
        Project project = projects.get(0);
        projectService.assign(project, user);
        user = userRepository.findFetchAllById(user.getId());
        assertTrue(user.getProjects().contains(project));
    }

    @Test
    public void create() {
        userRepository.deleteAll();
        sectionRepository.deleteAll();
        projectRepository.deleteAll();
        for(Project project: projects) {
            project.setId(null);
            projectService.create(project);
        }
        for(Project project: projectRepository.findAll()) {
            assertNotNull(project.getBasicTime().getCreated());
            log.warn(project + "");
        }
    }

    @Test
    public void getByNames() {
        log.warn( projectRepository.findAll() + "");
        log.warn( projectRepository.getByNames(Arrays.asList( "JSP","Java" )) + "" );
        log.warn( projectRepository.getByNames("JSP","Java") + "" );
    }

    @Test
    public void displayProjectUsers() {
        Project project = projects.get(0);
        FixtureFactory.assignProjectToUser(users, project, userRepository);
        projectService.displayProjectUsers(project.getName());
    }
}
