package com.siwoo.projpa.service.support;

public class CheckedServiceException extends Exception{
    private String code;

    public CheckedServiceException(String message, String code) {
        super(message);
        this.code = code;
    }

    public CheckedServiceException(String message, String code, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
