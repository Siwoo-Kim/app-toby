package com.siwoo.projpa.converter;

import com.siwoo.projpa.converter.support.ProjectConversionException;
import com.siwoo.projpa.domain.Project;
import com.siwoo.projpa.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;

@Service
public class ProjectPropertyEditor extends PropertyEditorSupport {

    @Autowired ProjectRepository projectRepository;

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if(!StringUtils.hasText(text)) {
            throw new ProjectConversionException("empty string cannot convert");
        }
        Project project = projectRepository.findByName(text);
        if(project == null) {
            throw new ProjectConversionException("Convert to Project -> String:" + text +" failed");
        }
        setValue(project);
    }
}
