package com.siwoo.projpa.service;

import com.siwoo.projpa.domain.Section;
import com.siwoo.projpa.repository.SectionRepository;
import com.siwoo.projpa.service.support.ServiceArgumentException;
import com.siwoo.projpa.service.support.ServiceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class SectionServiceImpl implements SectionService {

    @Autowired SectionRepository sectionRepository;

    List<Section> getByProject(String projectName) {
        if(StringUtils.hasText(projectName)) {
            throw new ServiceArgumentException("Argument[name] is not valid");
        }
        return sectionRepository.findByProjectName(projectName);
    }

}
