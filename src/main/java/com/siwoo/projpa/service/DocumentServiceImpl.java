package com.siwoo.projpa.service;

import com.siwoo.projpa.domain.Document;
import com.siwoo.projpa.repository.DocumentRepository;
import com.siwoo.projpa.service.support.ServiceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    DocumentRepository documentRepository;

    @Override
    public Optional<Document> getNullSafe(long documentId) {
        return documentRepository.findById(documentId);
    }

    @Override
    public Document get(long documentId) {
        throwIfNull(documentId);
        return getNullSafe(documentId).get();
    }

    @Override
    public List<Document> get() {
        return documentRepository.findAll();
    }

    @Override
    public Document save(Document document) {
        assertDocument(document);
        document.ifNullSetDefault();
        documentRepository.save(document);
        return document;
    }

    @Override
    public Document edit(long documentId, String title, String content) {
        throwIfNull(documentId);
        Document document = get(documentId);
        document.setTitle(title);
        document.setContent(content);
        document.updateTime(LocalDateTime.now());
        documentRepository.save(document);
        return document;
    }

    @Override
    public void delete(long documentId) {
        documentRepository.delete(get(documentId));
    }


    private void assertDocument(Document document) {
        Assert.notNull(document,"document must not null");
        Assert.hasText(document.getTitle(),"title must not empty string");
        Assert.hasText(document.getContent().trim(),"content must not empty string");
    }


    private void throwIfNull(long documentId) {
        if(!documentRepository.findById(documentId).isPresent()) {
            throw new ServiceNotFoundException("Document[id:" + documentId + "] not found","error.notFound.document.id");
        }
    }

}
