package com.siwoo.projpa.service.support.sql;

import com.siwoo.projpa.service.support.ServiceSqlNotFoundException;

import javax.annotation.PostConstruct;

public class BaseSqlService implements SqlService {
    protected SqlReader sqlReader;
    protected SqlRegistry sqlRegistry;

    public void setSqlReader(SqlReader sqlReader) {
        this.sqlReader = sqlReader;
    }

    public void setSqlRegistry(SqlRegistry sqlRegistry) {
        this.sqlRegistry = sqlRegistry;
    }

    @PostConstruct
    public void load() {
        this.sqlReader.read(sqlRegistry);
    }

    @Override
    public String sql(String key) {
        try{
            return sqlRegistry.getSql(key);
        }catch (ServiceSqlNotFoundException e) {
            /*  Ignore  */
            throw new RuntimeException(e);
        }
    }
}
