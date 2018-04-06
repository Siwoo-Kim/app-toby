package com.siwoo.projpa.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

@Slf4j
@Controller
@RequestMapping({"/","/home","/index"})
public class HomeController {

//    @Value("${app.admin.email}")
//    private String adminEmail;
//    @Value("${app.admin.name}")
//    private String adminName;
    @Autowired Environment environment;
    private static final Map<String,String> maps = new HashMap<>();

    @GetMapping
    public String home(Locale locale) {
      log.info(locale + " access the app");
      return "index";
    }

    @ResponseBody
    @GetMapping("/admin")
    public Map admin() {
        maps.put("email", environment.getProperty("app.admin.email"));
        maps.put("name", environment.getProperty("app.admin.name"));
        maps.put("contact", environment.getProperty("app.admin.contact"));
        return maps;
    }
}
