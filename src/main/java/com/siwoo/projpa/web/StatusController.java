package com.siwoo.projpa.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/status")
public class StatusController {


//    @GetMapping("/uuidGenerate")
//    public String generate(Model model, HttpSession httpSession) {
//        httpSession.setAttribute("uuid",UUID.randomUUID().toString());
//        return (String) httpSession.getAttribute("uuid");
//    }
//
//    @GetMapping("/uuid")
//    public String get(HttpSession httpSession) {
//        return (String) httpSession.getAttribute("uuid");
//    }
//
//    @GetMapping("/complete")
//    public void complete(HttpSession httpSession) {
//        httpSession.removeAttribute("uuid");
//        log.warn("Has session? " + httpSession.getAttribute("uuid"));
//    }

}
