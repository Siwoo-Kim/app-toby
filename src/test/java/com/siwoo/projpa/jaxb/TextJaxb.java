package com.siwoo.projpa.jaxb;

import com.siwoo.projpa.service.support.sql.OxmSqlService;
import com.siwoo.projpa.service.support.sql.SqlService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.oxm.Unmarshaller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import javax.xml.bind.JAXBException;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TextJaxb {

    @Autowired
    SqlService sqlService;
    @Autowired
    Unmarshaller unmarshaller;

    @Test
    public void parse() throws JAXBException, IOException {
        assertThat(sqlService, is(instanceOf(OxmSqlService.class)));
        String sql = sqlService.sql("INSERT");
        assertTrue(StringUtils.hasText(sql));
        log.warn(sql + "");
    }

    @Test
    public void parseWithOxm() throws IOException {
        Source xmlSource = new StreamSource(Files.newBufferedReader(FileSystems.getDefault().getPath("src/main/resources/META-INF/xml/native-query.xml")));
        Sqlmap sqlmap = (Sqlmap) this.unmarshaller.unmarshal(xmlSource);

        List<SqlType> sqlTypes = sqlmap.getSql();
        assertNotNull(sqlTypes);
    }

}
