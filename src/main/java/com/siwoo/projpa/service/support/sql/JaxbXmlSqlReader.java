package com.siwoo.projpa.service.support.sql;

import com.siwoo.projpa.jaxb.SqlType;
import com.siwoo.projpa.jaxb.Sqlmap;
import lombok.extern.slf4j.Slf4j;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

@Slf4j
public class JaxbXmlSqlReader implements SqlReader {
    private static final Path DEFAULT_PATH;
    static {
        DEFAULT_PATH = FileSystems.getDefault().getPath("src","main","resources", "META-INF", "xml" , "native-query.xml");
    }
    private Path sqlPath = DEFAULT_PATH;

    public void setSqlPath(Path sqlPath) {
        this.sqlPath = sqlPath;
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
}
