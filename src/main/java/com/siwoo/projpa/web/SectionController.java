package com.siwoo.projpa.web;

import com.siwoo.projpa.domain.Section;
import com.siwoo.projpa.domain.criteria.SectionCriteria;
import com.siwoo.projpa.repository.SectionRepository;
import com.siwoo.projpa.service.ProjectService;
import com.siwoo.projpa.service.SectionService;
import com.siwoo.projpa.web.support.BindingResultSupporter;
import com.siwoo.projpa.web.support.BindingModelAttributeFailedWebServiceException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;




import java.util.List;

@Slf4j
@RestController
@RequestMapping({"/section","/SECTION"})
public class SectionController {

    @Autowired
    SectionRepository sectionRepository;
    @Autowired
    SectionService sectionService;
    @Autowired
    ProjectService projectService;

    @GetMapping
    public List<Section> sections() {
        return sectionRepository.findAll();
    }

    @Getter @Setter @ToString
    private static class SectionParam{
        private String name;
        private String description;
        private Integer difficulty;
        private Long projectId;
    }

    @GetMapping({"search","SEARCH"})
    public List<Section> search(@ModelAttribute SectionParam sectionParam, BindingResult bindingResult) {
        log.warn(sectionParam + "");
        log.warn(bindingResult.hasErrors() + "");
        if(bindingResult.hasErrors()) {
            log.warn( bindingResult.getFieldError().getField() );
            log.warn( bindingResult.getFieldError().getRejectedValue() + "");
            BindingResultSupporter.FieldError fieldError = BindingResultSupporter.getFieldError(bindingResult);
            log.warn("Field: " + fieldError.getField());
            log.warn("Value: " + fieldError.getValue());

            throw new BindingModelAttributeFailedWebServiceException("url: /section/search, SectionParam[" + bindingResult.getFieldError() + "] is invalid, "+ fieldError.toString());
        }
        //Controller need to know how to build criteria, it is Coupling too much, need to fix.
        //Later, I will refactor this code by Converter
        return sectionService.search(
                new SectionCriteria(
                        sectionParam.name,
                        sectionParam.description,
                        sectionParam.difficulty,
                        sectionParam.projectId != null ?
                                projectService.get(sectionParam.projectId)
                                : null));
    }

    @GetMapping("/project/{projectName}")
    public List<Section> byProject(@PathVariable("projectName") String projectName) {
        return sectionRepository.findByProjectName(projectName);
    }
}
