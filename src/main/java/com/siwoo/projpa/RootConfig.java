package com.siwoo.projpa;

import com.siwoo.projpa.support.SqlReader;
import com.siwoo.projpa.support.SqlService;
import com.siwoo.projpa.support.XmlSqlService;
import com.siwoo.projpa.support.jaxb.Sqlmap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.castor.CastorMarshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import java.nio.file.FileSystems;

@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
@ComponentScan({"com.siwoo.projpa.repository","com.siwoo.projpa.converter"})
@EnableJpaRepositories("com.siwoo.projpa.repository")
@EntityScan("com.siwoo.projpa.domain")
@Profile({"dev","prod"})
public class RootConfig {

    @Bean
    PlatformTransactionManager transactionManager(@Autowired EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }

    @Bean
    SqlService xmlSqlService() {
        XmlSqlService sqlService = new XmlSqlService();
        sqlService.setSqlReader(sqlService);
        sqlService.setSqlmapFile(FileSystems.getDefault().getPath("src","main","resources","META-INF","xml","sqlmap.xml").toString());
        sqlService.setSqlRegistry(sqlService);
        return sqlService;
    }

    @Bean
    Unmarshaller unmarshaller() {
        CastorMarshaller castorMarshaller = new CastorMarshaller();
        castorMarshaller.setMappingLocation(new ClassPathResource("META-INF/xml/castor-sqlmap.xsd"));
        return castorMarshaller;
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
