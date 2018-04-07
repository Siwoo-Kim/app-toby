package com.siwoo.projpa.web.support;

public class WebServiceException extends RuntimeException{
    private final String code;

    public WebServiceException(String message, String code) {
        super(message);
        this.code = code;
    }

    public WebServiceException(String message, Throwable cause, String code) {
        super(message, cause);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
