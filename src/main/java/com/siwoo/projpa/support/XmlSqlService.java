package com.siwoo.projpa.support;

import com.siwoo.projpa.support.jaxb.SqlType;
import com.siwoo.projpa.support.jaxb.Sqlmap;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class XmlSqlService implements SqlService, SqlRegistry, SqlReader {
    private SqlReader sqlReader;
    private SqlRegistry sqlRegistry;

    public void setSqlReader(SqlReader sqlReader) {
        this.sqlReader = sqlReader;
    }

    public void setSqlRegistry(SqlRegistry sqlRegistry) {
        this.sqlRegistry = sqlRegistry;
    }

    @PostConstruct
    public void loadSql() {
        sqlReader.read(sqlRegistry);
    }

    @Override
    public String sql(String key) {
        return this.sqlRegistry.getSql(key);
    }

    /*  Implements SqlRegistry  */
    private Map<String, String> sqlMap = new HashMap<>();
    @Override
    public void registerSql(String key, String sql) {
        sqlMap.put(key,sql);
    }
    @Override
    public String getSql(String key) {
        String sql = sqlMap.get(key);
        if(sql == null) {
            throw new IllegalArgumentException("No Sql found for key: " + key );
        }
        return sql;
    }

    /*  Implements SqlReader  */
    private String sqlmapFile;
    public void setSqlmapFile(String sqlmapFile) {
        this.sqlmapFile = sqlmapFile;
    }

    @Override
    public void read(SqlRegistry sqlRegistry) {
        String contextPath = Sqlmap.class.getPackage().getName();
        try{
            JAXBContext context = JAXBContext.newInstance(contextPath);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Sqlmap sqlmap = (Sqlmap) unmarshaller.unmarshal(new BufferedReader(new FileReader(sqlmapFile)));
            for(SqlType sqlType: sqlmap.getSql()) {
                sqlRegistry.registerSql(sqlType.getKey(), sqlType.getValue());
            }
        }catch (JAXBException e) {
            System.out.println("Error in creating JAXBContext");
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            System.out.println("Error in reading file");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
