package com.siwoo.projpa.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

@Slf4j
@Controller
@RequestMapping({"/","/home","/index"})
public class HomeController {

    @GetMapping
    public String home(Locale locale) {
      log.info(locale + " access the app");
      return "index";
    }

}
