package com.siwoo.projpa.service.support.sql;

import com.siwoo.projpa.jaxb.SqlType;
import com.siwoo.projpa.jaxb.Sqlmap;
import com.siwoo.projpa.service.support.ServiceSqlNotFoundException;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class NativeSqlService implements SqlService, SqlRegistry, SqlReader{
    private SqlReader sqlReader;
    private SqlRegistry sqlRegistry;
    private Path sqlPath;


    public void setSqlPath(Path sqlPath) {
        this.sqlPath = sqlPath;
    }

    public void setSqlReader(SqlReader sqlReader) {
        this.sqlReader = sqlReader;
    }

    public void setSqlRegistry(SqlRegistry sqlRegistry) {
        this.sqlRegistry = sqlRegistry;
    }



    public NativeSqlService() {}

    @PostConstruct
    public void load() {
        sqlReader.read(sqlRegistry);
    }

    @Override
    public String sql(String key) {
        try {
            return sqlRegistry.getSql(key);
        } catch (ServiceSqlNotFoundException e) {
            /*  Currently Ignored  */
            throw new RuntimeException(e);
        }
    }

    private static final String PACKAGE_TO_MAP = Sqlmap.class.getPackage().getName();
    @Override
    public void read(SqlRegistry sqlRegistry) {
        try(BufferedReader reader = new BufferedReader(new FileReader(sqlPath.toFile()))) {
            JAXBContext context = JAXBContext.newInstance(PACKAGE_TO_MAP);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Sqlmap sqlmap = (Sqlmap) unmarshaller.unmarshal(reader);
            for(SqlType sqlType: sqlmap.getSql()) {
                sqlRegistry.registerSql(sqlType.getKey(), sqlType.getValue());
            }
        }catch (IOException e) {
            log.error("Error in handing the file");
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (JAXBException e) {
            log.error("Error to parsing xml");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }


    //SqlRegistry
    private Map<String, String> sqlContainer = new HashMap<>();

    @Override
    public void registerSql(String key, String sql) {
        sqlContainer.put(key, sql);
    }

    @Override
    public String getSql(String key) throws ServiceSqlNotFoundException {
        String sql = sqlContainer.get(key);
        if(sql == null) {
            throw new ServiceSqlNotFoundException("Could not find sql by key:" + key ,"error.notFound.sql");
        }
        return sql;
    }
}
