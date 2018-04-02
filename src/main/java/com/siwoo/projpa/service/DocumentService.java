package com.siwoo.projpa.service;

import com.siwoo.projpa.domain.Document;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional(readOnly = true )
public interface DocumentService {

    Optional<Document> getNullSafe(long documentId);

    Document get(long documentId);

    List<Document> get();

    @Transactional(readOnly = false)
    Document save(Document document);

    @Transactional(readOnly = false)
    Document edit(long documentId, String title, String content);

    @Transactional(readOnly = false)
    void delete(long documentId);
}
