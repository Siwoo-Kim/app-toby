package com.siwoo.projpa;

import com.siwoo.projpa.converter.ProjectConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Slf4j
@ComponentScan("com.siwoo.projpa.web")
@Configuration
public class WebConfig extends WebMvcConfigurationSupport{

    @Bean
    InternalResourceViewResolver viewResolver() {
        return new InternalResourceViewResolver("/static/",".html");
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
    }

    @Autowired
    ProjectConverter projectConverter;

    @Override
    protected void addFormatters(FormatterRegistry registry) {
        registry.addConverter(projectConverter);
    }

    @Override
    protected void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
