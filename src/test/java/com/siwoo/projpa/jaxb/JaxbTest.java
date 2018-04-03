package com.siwoo.projpa.jaxb;

import com.siwoo.projpa.support.SqlService;
import com.siwoo.projpa.support.jaxb.Sqlmap;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JaxbTest {

    @Autowired
    SqlService sqlService;

    @Before
    public void setup() {
        assertNotNull(sqlService);
        assertTrue(sqlService.sql("userAdd") != null);
    }
    @Test
    public void readSqlmap() throws JAXBException {
        String contextPath = Sqlmap.class.getPackage().getName();
        System.out.println(contextPath);
        JAXBContext context = JAXBContext.newInstance(contextPath);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Path sqlmapPath = FileSystems.getDefault().getPath("src","test","resources","META-INF","xml","sqlmap.xml");
        Sqlmap sqlmap = (Sqlmap) unmarshaller.unmarshal(sqlmapPath.toFile());

        assertThat(sqlmap.getSql().size(), is(3));
        assertThat(sqlmap.getSql().get(0).getKey(), is("add"));
        assertThat(sqlmap.getSql().get(0).getValue(), is("insert"));
        assertThat(sqlmap.getSql().get(1).getKey(), is("get"));
        assertThat(sqlmap.getSql().get(1).getValue(), is("select"));
        assertThat(sqlmap.getSql().get(2).getKey(), is("delete"));
        assertThat(sqlmap.getSql().get(2).getValue(), is("delete"));
    }
}
