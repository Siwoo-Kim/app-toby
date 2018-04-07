package com.siwoo.projpa.web.support;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Locale;

@Getter @Setter @ToString
public class ErrorMessage {
    String message;
    String code;
    Locale locale;
    public ErrorMessage(){};

}
