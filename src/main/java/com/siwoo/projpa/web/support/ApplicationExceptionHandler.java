package com.siwoo.projpa.web.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentConversionNotSupportedException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @Autowired ErrorMessageBuilder errorMessageBuilder;


    @ExceptionHandler(MethodArgumentConversionNotSupportedException.class)
    public void conversionFailed(Locale locale, HttpServletResponse response) throws IOException {
        ErrorMessage errorMessage = errorMessageBuilder.getMessage("error.web.request.conversion", locale);
        response.setCharacterEncoding("utf-8");
        response.setHeader("error", errorMessage.getMessage());
        response.sendRedirect("/index");
    }

}
