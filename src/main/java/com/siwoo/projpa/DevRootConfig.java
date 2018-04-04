package com.siwoo.projpa;

import com.siwoo.projpa.service.support.sql.*;
import com.siwoo.projpa.util.MakeSuore;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

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
        return new DefaultSqlService();
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
