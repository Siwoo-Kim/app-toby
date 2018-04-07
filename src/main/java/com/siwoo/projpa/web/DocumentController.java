package com.siwoo.projpa.web;

import com.siwoo.projpa.domain.Document;
import com.siwoo.projpa.service.DocumentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping({"/document","/DOCUMENT"})
public class DocumentController {

    @Autowired
    DocumentService documentService;

    @GetMapping
    public List<Document> getAll() {
        return documentService.get();
    }

    @GetMapping("/{id}")
    public Document get(@PathVariable("id") long documentId) {
        return documentService.get(documentId);
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Document post(@RequestBody Document document) {
        if(document.getId() != null) { throw new IllegalStateException(); }
        log.info(document + "");
        return documentService.save(document);
    }

    @PutMapping("/{id}")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public Document edit(@PathVariable("id") long documentId,@RequestBody Document document) {
        return documentService.edit(documentId,document.getTitle(), document.getContent());
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public void delete(@PathVariable("id") long documentId) {
        documentService.delete(documentId);
    }


}
