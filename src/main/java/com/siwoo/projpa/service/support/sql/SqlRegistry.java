package com.siwoo.projpa.service.support.sql;

import com.siwoo.projpa.service.support.ServiceSqlNotFoundException;

public interface SqlRegistry {

    void registerSql(String key, String sql);
    String getSql(String key) throws ServiceSqlNotFoundException; //expected to be recovered

}
