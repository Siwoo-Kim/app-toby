package com.siwoo.projpa.jaxb;

import com.siwoo.projpa.support.jaxb.SqlType;
import com.siwoo.projpa.support.jaxb.Sqlmap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.oxm.Unmarshaller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OxmTest {

    @Autowired
    Unmarshaller unmarshaller;

    @Test
    public void unmarshallSqlMap() throws IOException {

        Source xmlSource = new StreamSource(FileSystems.getDefault()
                .getPath("src","main","resources","META-INF","xml","sqlmap.xml").toFile());

        Sqlmap sqlmap = (Sqlmap) this.unmarshaller.unmarshal(xmlSource);
        List<SqlType> sqlTypes = sqlmap.getSql();

        assertTrue(sqlTypes.size() != 0);

    }

}
