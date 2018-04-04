package com.siwoo.projpa.service.support;


public class ServiceSqlNotFoundException extends CheckedServiceException {

    public ServiceSqlNotFoundException(String message, String code) {
        super(message, code);
    }

    public ServiceSqlNotFoundException(String message, String code, Throwable cause) {
        super(message, code, cause);
    }
}
