package com.siwoo.projpa.jaxb;

import com.siwoo.projpa.service.support.sql.SqlService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import javax.xml.bind.JAXBException;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TextJaxb {

    @Autowired
    SqlService sqlService;


    @Test
    public void parse() throws JAXBException, IOException {

//        JAXBContext context = JAXBContext.newInstance(Sqlmap.class.getPackage().getName());
//        Unmarshaller unmarshaller = context.createUnmarshaller();
//
//        try(BufferedReader reader = new BufferedReader(new FileReader(FileSystems.getDefault().getPath("src\\main\\resources\\META-INF\\xml\\test-sqlmap.xml").toFile()))){
//            Sqlmap sqlmap = (Sqlmap) unmarshaller.unmarshal(reader);
//            List<SqlType> sqlTypes = sqlmap.getSql();
//            assertEquals(sqlTypes.size(), 4);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            throw e;
//        } catch (IOException e) {
//            e.printStackTrace();
//            throw e;
//        }

        String sql = sqlService.sql("INSERT");
        assertTrue(StringUtils.hasText(sql));
        log.warn(sql + "");
    }


}
