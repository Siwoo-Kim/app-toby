package com.siwoo.projpa.repository;

import com.siwoo.projpa.FixtureFactory;
import com.siwoo.projpa.domain.BasicTime;
import com.siwoo.projpa.domain.Project;
import com.siwoo.projpa.domain.Section;
import com.siwoo.projpa.service.ProjectService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSectionRepository {

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
    private List<Section> sections;

    @Before
    public void setup() {
        projects = FixtureFactory.projects();
        sections = FixtureFactory.sections();
        sectionRepository.deleteAll();
        projectRepository.deleteAll();
        projectRepository.saveAll(projects);
        sectionRepository.saveAll(sections);
    }

    @Test
    public void findUpdateTimeGroupByProject() {
        Section section = sections.get(0);
        section.setProject(projects.get(0));
        section.setBasicTime(new BasicTime(LocalDateTime.now(),LocalDateTime.of(2018,3,24,12,12)));
        sectionRepository.save(section);
        section = sections.get(1);
        section.setProject(projects.get(0));
        section.setBasicTime(new BasicTime(LocalDateTime.now(),LocalDateTime.of(2018,3,25,12,12)));
        sectionRepository.save(section);

        section = sections.get(2);
        section.setProject(projects.get(1));
        section.setBasicTime(new BasicTime(LocalDateTime.now(),LocalDateTime.of(2018,3,21,22,33)));
        sectionRepository.save(section);

        List<Object[]> rows = sectionRepository.findMaxUpdateTimeAndProjectGroupByProject();
        for(Object[] row : rows) {
            log.warn(row[0] + "");
            log.warn(row[1] + "");
        }

        projectService.updateLastUpdatedSections();
        log.warn(projectRepository.findAll() + "");

    }
}
