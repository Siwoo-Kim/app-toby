package com.siwoo.projpa.domain.support;

public class NotExistingLevelException extends DomainException{
    private static final String code = "error.invalid.Level.value";

    public NotExistingLevelException(String message) {
        super(message, code);
    }

    public NotExistingLevelException(String message, Throwable cause) {
        super(message, code, cause);
    }
}
