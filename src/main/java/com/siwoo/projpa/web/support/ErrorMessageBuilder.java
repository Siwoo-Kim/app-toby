package com.siwoo.projpa.web.support;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class ErrorMessageBuilder extends ErrorMessage implements MessageSourceAware{
    private MessageSource messageSource;

    public ErrorMessageBuilder() {}

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public ErrorMessage getMessage(String code,Locale locale) {
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.code = code;
        errorMessage.locale = locale;
        errorMessage.message = messageSource.getMessage(code,null,locale);
        return errorMessage;
    }


}
