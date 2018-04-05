package com.siwoo.projpa.repository;

import com.siwoo.projpa.FixtureFactory;
import com.siwoo.projpa.domain.*;
import com.siwoo.projpa.domain.criteria.SectionCriteria;
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
import static org.junit.Assert.*;

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
    DocumentRepository documentRepository;

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
        userRepository.deleteAll();
        documentRepository.deleteAll();
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

    @Test
    public void findSectionWithDocumentSummary() {
        Section section = FixtureFactory.sections().get(0);
        sectionRepository.save(section);
        List<Document> documents = FixtureFactory.documents();

        for(Document document: documents) {
            document.setSection(section);
            documentRepository.save(document);
        }

        SectionSummary sectionSummary = sectionRepository.findSectionSummary(section.getId());
        assertNotNull(sectionSummary);
        assertTrue(sectionSummary.getDocumentSummary().size() == documentRepository.countBySectionId(section.getId()));
        for(DocumentSummary documentSummary: sectionSummary.getDocumentSummary()) {
            assertNotNull(documentSummary);
        }
    }

    @Test
    public void findSectionByProject() {
        Project project = FixtureFactory.projects().get(0);
        projectRepository.save(project);

        List<Section> sections = FixtureFactory.sections();
        for(Section section: sections) {
            section.setProject(project);
            sectionRepository.save(section);
        }

        List<Section> found = sectionRepository.findByProject(project.getId());
        assertEquals(found.size(), sections.size());
        for(Section section: found) {
            assertTrue(sections.contains(section));
        }
    }

    @Test
    public void findCriteriaMatchAny() {
        Project project = FixtureFactory.projects().get(0);
        projectRepository.save(project);

        List<Section> sections = FixtureFactory.sections();
        for(Section section: sections) {
            section.setProject(project);
            sectionRepository.save(section);
        }

        Section section = sections.get(3);
        String searchName = sections.get(3).getName();
        String searchDescription = sections.get(3).getDescription().substring(1,5);
        int difficulty = sections.get(3).getDifficulty();
        Project project1 = sections.get(3).getProject();

        List<Section> found = sectionRepository.findByCriteriaMatchALL(new SectionCriteria(searchName, null, 0, null, SectionCriteria.Search.NAME));
        assertTrue(found.contains(section));
        log.warn(found + " ");

        found = sectionRepository.findByCriteriaMatchALL(new SectionCriteria(searchName,"NOT EXISTS", null ,null , SectionCriteria.Search.NAME,SectionCriteria.Search.DESCRIPTION));
        assertTrue(found.contains(section));
        log.warn(found + " ");

        Section section2 = sections.get(4);
        found = sectionRepository.findByCriteriaMatchALL(new SectionCriteria(searchName,section2.getDescription(), null, null,   SectionCriteria.Search.NAME,SectionCriteria.Search.DESCRIPTION));
        assertTrue(found.contains(section));
        assertTrue(found.contains(section2));

        found = sectionRepository.findByCriteriaMatchALL(
                new SectionCriteria(null,null,difficulty, null, SectionCriteria.Search.DIFFICULTY)
        );
        assertTrue(found.contains(section));

        found = sectionRepository.findByCriteriaMatchALL(
                new SectionCriteria(null,null,null, section.getProject(), SectionCriteria.Search.PROJECT)
        );
        assertTrue(found.contains(section));

        Project project2 = FixtureFactory.projects().get(1);
        projectRepository.save(project2);

        List<Section> sections2 = FixtureFactory.sections();
        for(Section sec: sections2) {
            section.setProject(project2);
            sectionRepository.save(sec);
        }
//
//        List<Section> concated = sectionRepository.findSectionByProjects(project, project2);
//        log.warn(concated + "");
//
//        for(Section s: sections) {
//            assertTrue(concated.contains(s));
//        }
//        for(Section s: sections2) {
//            assertTrue(concated.contains(s));
//        }

    }
}
