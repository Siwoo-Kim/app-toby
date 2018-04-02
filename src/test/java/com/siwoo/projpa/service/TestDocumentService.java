package com.siwoo.projpa.service;

import com.siwoo.projpa.FixtureFactory;
import com.siwoo.projpa.domain.Document;
import com.siwoo.projpa.repository.DocumentRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.AssertionErrors;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDocumentService {

    @Autowired DocumentService documentService;
    @Autowired
    DocumentRepository documentRepository;
    List<Document> documents;

    @Before
    public void setup() {
        documents = FixtureFactory.documents();
        documentRepository.saveAll(documents);
    }

    @Test
    public void get() {
        Document document = documentService.get(documents.get(0).getId());
        assertNotNull(document);
        log.info(document + "");
    }


    @Test(expected = IllegalArgumentException.class)
    public void save() {
        Document document = FixtureFactory.documents().get(0);
        document.setBasicTime(null);
        documentService.save(document);
        assertNotNull(document.getBasicTime().getCreated());
        document = documentService.get(document.getId());
        log.info(document + "");
        document = FixtureFactory.documents().get(0);
        document.setTitle(null);
        documentService.save(document);
        fail();
    }

    @Test
    public void update() {
        String newTitle = "title1";
        String newContent = "new content1";

        Document document = documents.get(0);
        documentService.edit(document.getId(),newTitle,newContent);
        document = documentService.get(document.getId());
        assertTrue(document.getTitle().equals(newTitle));
        assertTrue(document.getContent().equals(newContent));
        log.info( document + "");
    }
}
