package com.siwoo.projpa.converter.support;

public class ProjectConversionException extends ConversionException {
    private static final String code = "error.convert.project";

    public ProjectConversionException(String message) {
        super(message, code);
    }

    public ProjectConversionException(String message, Throwable cause) {
        super(message, cause, code);
    }
}
