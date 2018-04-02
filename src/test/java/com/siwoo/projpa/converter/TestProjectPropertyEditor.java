package com.siwoo.projpa.converter;

import com.siwoo.projpa.FixtureFactory;
import com.siwoo.projpa.domain.Project;
import com.siwoo.projpa.domain.User;
import com.siwoo.projpa.repository.ProjectRepository;
import com.siwoo.projpa.repository.SectionRepository;
import com.siwoo.projpa.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.beans.PropertyEditorSupport;
import java.util.List;

import static org.junit.Assert.assertNotNull;

@Transactional
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestProjectPropertyEditor {

    @Autowired
    PropertyEditorSupport propertyEditorSupport;
    @Autowired
    ProjectConverter projectConverter;
    @Autowired
    UserConverter userConverter;
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    SectionRepository sectionRepository;

    private List<Project> projects;
    private List<User> users;

    @Before
    public void setup() {
        projects = FixtureFactory.projects();
        users = FixtureFactory.users();
        sectionRepository.deleteAll();
        projectRepository.deleteAll();
        userRepository.deleteAll();
        projectRepository.saveAll(projects);
        userRepository.saveAll(users);
    }

    @Test
    public void setAsTest() {
        propertyEditorSupport.setAsText("java");
        Project project = (Project) propertyEditorSupport.getValue();
        assertNotNull(project);
        log.warn(project.toString());
    }

    @Test
    public void convert() {

        Project project = projectConverter.convert("java");
        assertNotNull(project);
        log.warn(project.toString());
    }

    @Test
    public void convert2() {
        User user = userConverter.convert( users.get(0).getEmail() );
        assertNotNull(user);
        log.warn(user.toString());
    }
}
