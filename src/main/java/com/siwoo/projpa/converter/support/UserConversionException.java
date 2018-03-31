package com.siwoo.projpa.converter.support;

import org.springframework.core.convert.ConversionService;

public class UserConversionException extends ConversionException{
    private static final String code = "error.convert.user";

    public UserConversionException(String message) {
        super(message, code);
    }

    public UserConversionException(String message, Throwable cause) {
        super(message, cause, code);
    }
}
