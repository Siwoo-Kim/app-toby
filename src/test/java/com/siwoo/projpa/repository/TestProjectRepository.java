package com.siwoo.projpa.repository;

import com.siwoo.projpa.FixtureFactory;
import com.siwoo.projpa.domain.Project;
import com.siwoo.projpa.domain.User;
import com.siwoo.projpa.service.ProjectService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

import static com.siwoo.projpa.FixtureFactory.getName;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@Transactional
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestProjectRepository {

    @Autowired
    UserRepository userRepository;
    @Autowired ProjectRepository projectRepository;
    @Autowired
    ProjectService projectService;
    private List<User> users;
    private List<Project> projects;

    @Before
    public void setup() {
        assertNotNull(getName(userRepository)+" must not null" ,userRepository);
        users = FixtureFactory.users();
        projects = FixtureFactory.projects();

        projectRepository.saveAll(projects);
    }

    @Test
    public void findIdAndManagerCount() {
        FixtureFactory.assignProjectToUser(users, projects.get(0), userRepository);
        users = FixtureFactory.users();
        FixtureFactory.assignProjectToUser(users.subList(0,3), projects.get(1), userRepository);

        List<Object[]> rows = projectRepository.findIdAndManagerCount();
        int count = 0;
        for(Object[] row: rows) {
            if(row[0] == projects.get(0).getId()) {
                count++;
                assertTrue(users.size() == (long) row[1]);
            } else if ( row[0] == projects.get(1).getId()) {
                count++;
                assertTrue((long)row[1] == 3);
            }
        }
        assertTrue(count == 2);

        Map<Project, Long> map =  projectService.countManagers();
        for(Project project: map.keySet()) {
            log.warn("Project : "+project.getName() + ", count: "+map.get(project));
        }

        Project project = projectService.maxManagerProject();
        log.warn(project + "");

        log.warn( projectRepository.findSummaryAll() + "");
    }



}