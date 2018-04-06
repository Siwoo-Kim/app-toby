package com.siwoo.projpa;

import com.siwoo.projpa.jaxb.Sqlmap;
import com.siwoo.projpa.service.support.sql.*;
import com.siwoo.projpa.util.MakeSuore;
import org.junit.Before;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import javax.sql.DataSource;
import java.nio.file.FileSystems;
import java.nio.file.Path;

@Profile("dev")
@Configuration
public class DevRootConfig {

    @Bean
    MakeSuore makeSuore(){
        return new MakeSuore("dev");
    }


    @Bean
    SqlService sqlService() {
        OxmSqlService sqlService = new OxmSqlService();
        sqlService.setSqlmapPath(new FileSystemResource("src/main/resources/META-INF/xml/native-query.xml"));
        sqlService.setUnmarshaller(marshaller());
        return sqlService;
    }

    @Bean
    Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(Sqlmap.class.getPackage().getName());
        return marshaller;
    }
//    @Bean
//    SqlReader sqlReader() {
//        JaxbXmlSqlReader sqlReader = new JaxbXmlSqlReader();
//        sqlReader.setSqlPath(sqlPath());
//        return sqlReader;
//    }
//
//    @Bean
//    SqlRegistry sqlRegistry() {
//        return new HashMapSqlRegistry();
//    }


    @Bean
    Path sqlPath() {
        return FileSystems.getDefault().getPath("src","main","resources","META-INF","xml","native-query.xml");
    }

    @Bean
    DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
    }
}
