package com.siwoo.projpa.web.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentConversionNotSupportedException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @Autowired ErrorMessageBuilder errorMessageBuilder;


    @ResponseBody
    @ExceptionHandler(MethodArgumentConversionNotSupportedException.class)
    public ErrorMessage conversionFailed(Locale locale, HttpServletResponse response) throws IOException {
        ErrorMessage errorMessage = errorMessageBuilder.getMessage("error.web.request.conversion", locale);
        return errorMessage;
    }

    //Binding to ModelAttribute is failed
    @ResponseBody
    @ExceptionHandler(BindingModelAttributeFailedWebServiceException.class)
    public ErrorMessage modelAttributePropertyConversionFailed(BindingModelAttributeFailedWebServiceException e, Locale locale, HttpServletResponse response) throws IOException {
        ErrorMessage errorMessage = errorMessageBuilder.getMessage(e.getCode(), locale);
        response.setCharacterEncoding("utf-8");
        System.out.println("Handling error");
        return errorMessage;
    }

}
