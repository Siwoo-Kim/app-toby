package com.siwoo.projpa.web;

import com.siwoo.projpa.domain.Project;
import com.siwoo.projpa.repository.ProjectRepository;
import com.siwoo.projpa.service.ProjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/project")
@RestController
public class ProjectController {

    @Autowired
    ProjectService projectService;
    @Autowired
    ProjectRepository projectRepository;

    @GetMapping
    public List<Project> projects() {
        return projectService.getAll();
    }

    @GetMapping("/{name}")
    public Project getProject(@PathVariable("name") Project project) {
        log.info(project + "");
        return project;
    }

    @GetMapping(params = "name")
    public Project getProject(@RequestParam("name") String name) {
        return projectRepository.findByName(name);
    }


}
