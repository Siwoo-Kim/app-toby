package com.siwoo.projpa.web;

import com.siwoo.projpa.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpRequest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.util.WebUtils;

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
    @Autowired
    MailService mailService;
    @Value("${spring.mail.username}")
    private String fromEmail;

    @GetMapping
    public String home(@RequestHeader("Host") String host, Locale locale) {
        //mailService.send(mailService.createMailMessage(fromEmail, "Someone visit your homepage!", "Host: " + host + ", locale " + locale ));
        return "index";
    }

    @GetMapping(params = "error=true")
    public String error(@RequestParam("message") String error, Locale locale) {
        System.out.println("Error " + error);
        //mailService.send(mailService.createMailMessage(fromEmail, "You got error ", "Error: " + error + ", locale " + locale ));
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
