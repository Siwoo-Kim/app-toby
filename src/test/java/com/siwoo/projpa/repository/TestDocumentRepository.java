package com.siwoo.projpa.repository;

import com.siwoo.projpa.FixtureFactory;
import com.siwoo.projpa.domain.Document;
import com.siwoo.projpa.domain.User;
import com.siwoo.projpa.domain.criteria.DocumentCriteria;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Tuple;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDocumentRepository {


    @Autowired DocumentRepository documentRepository;
    @Autowired UserRepository userRepository;

    List<Document> documents;
    List<User> users;
    @Transactional
    @Before
    public void setup() {
        documents = FixtureFactory.documents();
        users = FixtureFactory.users();
        userRepository.saveAll(users);
        documentRepository.saveAll(documents);
    }

    @Test
    public void findByTitle() {
        String title = documents.get(0).getTitle();
        List<Document> found = documentRepository.findByTitle(title);
        assertTrue(found.size() != 0);
        for(Document document : found) {
            assertEquals(title, document.getTitle());
        }
    }

    @Test
    public void findByCriteria() {
        String title = documents.get(0).getTitle();
        DocumentCriteria documentCriteria = new DocumentCriteria(title,null,null,null, DocumentCriteria.Search.TITLE);
        List<Document> found = documentRepository.findByCriteria(documentCriteria);
        assertTrue(found.size() != 0);
        for(Document document : found) {
            assertEquals(title, document.getTitle());
        }

        title = documents.get(0).getTitle();
        String description = "not exitsts";
        documentCriteria = new DocumentCriteria(title,null,description,null, DocumentCriteria.Search.TITLE, DocumentCriteria.Search.DESCRIPTION);
        found = documentRepository.findByCriteria(documentCriteria);
        assertFalse(found.size() != 0);

        description = documents.get(0).getDescription();
        documentCriteria = new DocumentCriteria(title,null,description,null, DocumentCriteria.Search.TITLE, DocumentCriteria.Search.DESCRIPTION);
        found = documentRepository.findByCriteria(documentCriteria);
        assertTrue(found.size() != 0);
        for(Document document : found) {
            assertEquals(title, document.getTitle());
            assertEquals(description, document.getDescription());
        }
    }

    @Test
    public void findTitleById() {
        String title = documents.get(0).getTitle();
        String found = documentRepository.findTitleById(documents.get(0).getId());
        assertEquals(title,found);
    }

    @Test
    public void findByUserId() {
        User user = users.get(0);
        for(Document document: documents) {
            document.setOwner(user);
            documentRepository.save(document);
        }
        List<Document> found = documentRepository.findByUserId(user.getId());
        for(Document document: found) {
            assertTrue(user.equals(document.getOwner()));
        }

        found = documentRepository.findByUserEmail(user.getEmail());
        for(Document document: found) {
            assertEquals(document.getOwner().getEmail(), user.getEmail());
        }
    }

    @Test
    public void findTitleAndSubtitleById() {
        Document document = documents.get(0);
        Tuple found = documentRepository.findTitleAndSubtitleById(document.getId());
        log.warn(found.toString());
        log.warn(Arrays.toString(found.toArray()));

        assertEquals(found.get(0), document.getTitle());
        assertEquals(found.get(DocumentRepository.COLUMN_TITLE), document.getTitle());
        assertEquals(found.get(1), document.getSubtitle());
        assertEquals(found.get(DocumentRepository.COLUMN_SUBTITLE), document.getSubtitle());

    }
}
