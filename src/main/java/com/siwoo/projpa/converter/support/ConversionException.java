package com.siwoo.projpa.converter.support;

public class ConversionException extends RuntimeException {
    private String code = "error.convert";

    public ConversionException(String message, String code) {
        super(message);
        this.code = code;
    }

    public ConversionException(String message, Throwable cause, String code) {
        super(message, cause);
        this.code = code;
    }
}
