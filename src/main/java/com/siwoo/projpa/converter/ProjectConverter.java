package com.siwoo.projpa.converter;


import com.siwoo.projpa.converter.support.ProjectConversionException;
import com.siwoo.projpa.domain.Project;
import com.siwoo.projpa.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.regex.Pattern;

@Service
public class ProjectConverter implements Converter<String,Project> {

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public Project convert(String text) {
        Assert.hasText(text, "value must not empty string");

        if(Pattern.matches("^[a-zA-Z0-9]+$",text)) {
           return projectRepository.findByName(text);
        }

        throw new ProjectConversionException("Cannot convert to Project with String:"+text);
    }
}
