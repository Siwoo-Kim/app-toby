package com.siwoo.projpa;

import com.siwoo.projpa.converter.ProjectConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@ComponentScan("com.siwoo.projpa.repository")
@EnableJpaRepositories("com.siwoo.projpa.repository")
@EntityScan("com.siwoo.projpa.domain")
@Profile({"prod", "dev"})
public class RootConfig {

    @Bean
    PlatformTransactionManager transactionManager(@Autowired EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }

    @Autowired ProjectConverter projectConverter;
    
    @Bean
    ConversionServiceFactoryBean conversionServiceFactoryBean() {
        ConversionServiceFactoryBean factoryBean = new ConversionServiceFactoryBean();
        Set<Converter> converters = new HashSet<>();
        converters.add(projectConverter);
        factoryBean.setConverters(converters);
        return factoryBean;
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
