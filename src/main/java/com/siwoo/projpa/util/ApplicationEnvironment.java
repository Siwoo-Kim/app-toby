package com.siwoo.projpa.util;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service @Getter
public class ApplicationEnvironment {

    @Value("${spring.profiles.active}")
    private String profile;
    @Value("${spring.datasource.driver-class-name}")
    private String activeDatabase;
    @Value("${java.version}")
    private String javaVersion;
    @Value("Siwoo Kim")
    private String author;

//    @PostConstruct
//    public void init() {
//        profile = environment.getProperty("spring.profiles.active");
//        activeDatabase = environment.getProperty("spring.datasource.driver-class-name");
//        javaVersion = environment.getProperty("java.version");
//        author = "Siwoo Kim";
//    }

}
