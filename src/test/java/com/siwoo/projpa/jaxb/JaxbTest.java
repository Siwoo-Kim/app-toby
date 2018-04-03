package com.siwoo.projpa.jaxb;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class JaxbTest {

    @Test
    public void readSqlmap() throws JAXBException {
        String contextPath = Sqlmap.class.getPackage().getName();
        System.out.println(contextPath);
        JAXBContext context = JAXBContext.newInstance(contextPath);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Path sqlmapPath = FileSystems.getDefault().getPath("src","test","resources","META-INF","xml","sqlmap.xml");
        Sqlmap sqlmap = (Sqlmap) unmarshaller.unmarshal(sqlmapPath.toFile());

        assertThat(sqlmap.getSql().size(), is(3));
        assertThat(sqlmap.getSql().);

    }
}
