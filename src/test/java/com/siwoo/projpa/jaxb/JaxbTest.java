package com.siwoo.projpa.jaxb;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class JaxbTest {

    @Test
    public void readSqlMap() throws JAXBException {
        String contextPath = Sqlmap.class.getPackage().getName();
        System.out.println(contextPath);
        JAXBContext context = JAXBContext.newInstance(contextPath);

        Unmarshaller unmarshaller = context.createUnmarshaller();
        Sqlmap sqlmap = (Sqlmap) unmarshaller.unmarshal(getClass().getResourceAsStream("/META-INF/xml/sqlmap.xml"));

        List<SqlType> sqlTypes = sqlmap.getSql();
        assertThat(sqlTypes.size() , is(3));

    }
}
