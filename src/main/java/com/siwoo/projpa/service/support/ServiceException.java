package com.siwoo.projpa.service.support;

public class ServiceException extends RuntimeException{
    private String code;

    public ServiceException(String message, String code) {
        super(message);
        this.code = code;
    }

    public ServiceException(String message, String code, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
