package com.siwoo.projpa.learning;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import static org.junit.Assert.assertNotNull;


public class LearningProperties {

    @Test
    public void property() throws IOException {
        Properties properties = new Properties();
        properties.load(Files.newBufferedReader(Paths.get("src/main/resources/META-INF/properties/database.properties")));
        assertNotNull(properties);
        ApplicationContext c = new GenericXmlApplicationContext(new FileSystemResource("src/test/java/com/siwoo/projpa/learning/testing-context.xml"));
        assertNotNull(c);
        properties = c.getBean("dbProperties",Properties.class);
        assertNotNull(properties);
    }

}
