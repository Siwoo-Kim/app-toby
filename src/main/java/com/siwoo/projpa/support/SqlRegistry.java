package com.siwoo.projpa.support;

public interface SqlRegistry {

    void registerSql(String key, String sql);
    String getSql(String key);

}
