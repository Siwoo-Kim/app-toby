package com.siwoo.projpa.domain.support;

import lombok.Getter;

@Getter
public class DomainException extends RuntimeException {
    private String code;

    public DomainException(String message, String code) {
        super(message);
        this.code = code;
    }

    public DomainException(String message, String code, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
