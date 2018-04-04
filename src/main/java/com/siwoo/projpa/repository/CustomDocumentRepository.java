package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.Document;
import com.siwoo.projpa.domain.criteria.DocumentCriteria;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Tuple;
import java.util.List;

@Transactional(readOnly = true)
public interface CustomDocumentRepository {

    List<Document> findByTitle(String title);

    List<Document> findByCriteria(DocumentCriteria documentCriteria);

    String findTitleById(long id);

    List<Document> findByUserId(long userId);

    List<Document> findByUserEmail(String email);

    Tuple findTitleAndSubtitleById(long id);
}
