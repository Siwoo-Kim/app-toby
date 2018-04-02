package com.siwoo.projpa.service.support;

public class ServiceNotFoundException extends ServiceException {

    public ServiceNotFoundException(String message, String code) {
        super(message, code);
    }

    public ServiceNotFoundException(String message, String code, Throwable cause) {
        super(message, code, cause);
    }

}
