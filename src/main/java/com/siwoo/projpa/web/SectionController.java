package com.siwoo.projpa.web;

import com.siwoo.projpa.domain.Section;
import com.siwoo.projpa.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/section","/SECTION"})
public class SectionController {

    @Autowired
    SectionRepository sectionRepository;

    @GetMapping
    public List<Section> sections() {
        return sectionRepository.findAll();
    }

    @GetMapping("/project/{projectName}")
    public List<Section> byProject(@PathVariable("projectName") String projectName) {
        return sectionRepository.findByProjectName(projectName);
    }
}
