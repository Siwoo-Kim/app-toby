package com.siwoo.projpa.web;

import com.siwoo.projpa.web.support.ErrorMessage;
import com.siwoo.projpa.web.support.ErrorMessageBuilder;
import com.siwoo.projpa.web.support.WebServiceException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping({"/message","/MESSAGE"})
public class MessageController {

    @Autowired
    ErrorMessageBuilder errorMessageBuilder;

    @GetMapping(value = {"/error","/ERROR"},params = "code")
    public ErrorMessage error(@RequestParam("code") String code, Locale locale) {
        return errorMessageBuilder.getMessage(code, locale);
    }

    @Getter @Setter @ToString
    public static class SimpleBean{
        public String name;
        public int age;
    }

    @GetMapping("binding")
    public SimpleBean simpleBean(@ModelAttribute SimpleBean simpleBean, BindingResult bindingResult) {
        log.warn(simpleBean + "");
        log.warn(bindingResult.hasErrors() + "");
        log.warn(bindingResult.getFieldError().getCode());
        if(bindingResult.hasErrors()) { throw new WebServiceException("Url : /binding , Invalid Parameter : " + bindingResult.getFieldError().getField(), bindingResult.getFieldError().getCode()); }
        return simpleBean;
    }

    @ResponseBody
    @ExceptionHandler(WebServiceException.class)
    public ErrorMessage serviceExceptionHandler(WebServiceException e, Locale locale) {
        log.error("Error Catched");
        return errorMessageBuilder.getMessage(e.getCode(), locale);
    }

}
