package com.siwoo.projpa.web;

import com.siwoo.projpa.domain.Journal;
import com.siwoo.projpa.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalController {

    @Autowired
    JournalRepository journalRepository;

    @GetMapping
    public List<Journal> journals() {
        return journalRepository.findAll();
    }
}
