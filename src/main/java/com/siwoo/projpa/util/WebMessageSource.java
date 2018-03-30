package com.siwoo.projpa.util;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class WebMessageSource implements MessageSourceAware{

    private MessageSource ms;

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.ms = messageSource;
    }

    public void getErrorCode() {

    }
}
