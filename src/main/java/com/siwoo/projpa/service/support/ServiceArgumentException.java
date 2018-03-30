package com.siwoo.projpa.service.support;

public class ServiceArgumentException extends ServiceException{
    private static final String code = "error.invalid.argument";

    public ServiceArgumentException(String message) {
        super(message, code);
    }

    public ServiceArgumentException(String message, Throwable cause) {
        super(message, code, cause);
    }
}
