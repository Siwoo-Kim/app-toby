package com.siwoo.projpa.service.support.sql;

import com.siwoo.projpa.service.support.ServiceSqlNotFoundException;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class HashMapSqlRegistry implements SqlRegistry {
    private Map<String, String> container = new HashMap<>();

    @Override
    public void registerSql(String key, String sql) {
        String replaced = container.put(key, sql);
        if(replaced != null) {
            log.warn(replaced + " is replaced by " + container.get(key) );
        }
    }

    @Override
    public String getSql(String key) throws ServiceSqlNotFoundException {
        String sql = container.get(key);
        if(sql == null) {
            throw new ServiceSqlNotFoundException("Could not find sql by key:" + key ,"error.notFound.sql");
        }
        return sql;
    }
}
