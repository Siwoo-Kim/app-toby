package com.siwoo.projpa;

import com.siwoo.projpa.service.support.sql.NativeSqlService;
import com.siwoo.projpa.service.support.sql.SqlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import javax.persistence.EntityManagerFactory;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;


@Slf4j
@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@ComponentScan({"com.siwoo.projpa.repository","com.siwoo.projpa.converter"})
@EnableJpaRepositories("com.siwoo.projpa.repository")
@EntityScan("com.siwoo.projpa.domain")
@PropertySource(name="appProperties",
        value={"file:src/main/resources/META-INF/properties/admin.properties"})
@Profile({"dev","prod"})
public class RootConfig {

    @Bean
    PlatformTransactionManager transactionManager(@Autowired EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }



//    @Bean
//    Properties mailProps() {
//        Properties properties = new Properties();
//        properties.setProperty("mail.smtp.auth","true");
//        properties.setProperty("mail.smtp.starttls.enable","true");
//        return properties;
//    }
//
//    @Bean
//    JavaMailSender javaMailSender() {
//        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
//        javaMailSender.setJavaMailProperties(mailProps());
//        return javaMailSender;
//    }
}
