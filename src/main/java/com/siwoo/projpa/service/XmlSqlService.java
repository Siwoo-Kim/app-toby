package com.siwoo.projpa.service;

import com.siwoo.projpa.jaxb.Sqlmap;
import lombok.extern.slf4j.Slf4j;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@Slf4j
public class XmlSqlService implements SqlService{
    private Map<String, String> sqlMap = new HashMap<>();

    public XmlSqlService(Map<String, String> sqlMap) {
        String contextPath = Sqlmap.class.getPackage().getName();
        try{
            JAXBContext context = JAXBContext.newInstance(contextPath);


        }catch (JAXBException e) {
            log.error("Error in creating JAXBContext");
            e.printStackTrace();
        };

    }
}
