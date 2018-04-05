package com.siwoo.projpa.domain.support;

public class CriteriaException extends DomainException {
    public CriteriaException(String message, String code) {
        super(message, code);
    }

    public CriteriaException(String message, String code, Throwable cause) {
        super(message, code, cause);
    }
}
