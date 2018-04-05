package com.siwoo.projpa.service.support.sql;

import com.siwoo.projpa.jaxb.SqlType;
import com.siwoo.projpa.jaxb.Sqlmap;
import com.siwoo.projpa.service.support.ServiceSqlNotFoundException;
import org.springframework.oxm.Unmarshaller;

import javax.annotation.PostConstruct;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class OxmSqlService implements SqlService{
    private final OxmSqlReader oxmSqlReader = new OxmSqlReader();
    private SqlRegistry sqlRegistry = new HashMapSqlRegistry();

    public void setSqlRegistry(SqlRegistry sqlRegistry) {
        this.sqlRegistry = sqlRegistry;
    }

    public void setUnmarshaller(Unmarshaller unmarshaler) {
        this.oxmSqlReader.setUnmarshaller(unmarshaler);
    }

    public void setSqlmapPath(Path sqlmapPath) {
        this.oxmSqlReader.setSqlmapPath(sqlmapPath);
    }

    @PostConstruct
    public void load() {
        this.oxmSqlReader.read(this.sqlRegistry);
    }

    @Override
    public String sql(String key) {
        try {
            return this.sqlRegistry.getSql(key);
        }catch (ServiceSqlNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static class OxmSqlReader implements SqlReader{
        private Unmarshaller unmarshaller;
        private Path sqlmapPath;

        @Override
        public void read(SqlRegistry sqlRegistry) {
            try(BufferedReader bufferedReader = Files.newBufferedReader(sqlmapPath)) {
                Source source = new StreamSource(bufferedReader);
                Sqlmap sqlmap = (Sqlmap) unmarshaller.unmarshal(source);

                for(SqlType sqlType: sqlmap.getSql()) {
                    sqlRegistry.registerSql(sqlType.getKey(), sqlType.getValue());
                }
            } catch (IOException e) {
                throw new IllegalArgumentException(this.sqlmapPath+ "");
            }
        }

        public void setUnmarshaller(Unmarshaller unmarshaller) {
            this.unmarshaller = unmarshaller;
        }

        public void setSqlmapPath(Path sqlmapPath) {
            this.sqlmapPath = sqlmapPath;
        }
    }
}
