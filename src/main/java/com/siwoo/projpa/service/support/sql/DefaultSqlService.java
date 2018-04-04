package com.siwoo.projpa.service.support.sql;

public class DefaultSqlService extends BaseSqlService{

    public DefaultSqlService() {
        setSqlReader(new JaxbXmlSqlReader());
        setSqlRegistry(new HashMapSqlRegistry());
    }

}
