package com.siwoo.projpa.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/cookie")
public class CookieController {

    @GetMapping(params = "name")
    public Map<String, String> cookie(@RequestParam("name") String name, HttpServletRequest request) {
        Map<String,String> cookieMap = new HashMap<>();
        Arrays.asList(request.getCookies()).stream().filter(cookie -> cookie.getName().equals(name))
                .forEach(cookie -> {
                    log.warn("Cookie " + cookie + ", value:" + cookie.getValue());
                    cookieMap.put(cookie.getName(), cookie.getValue());
                });
        return cookieMap;
    }

    @PostMapping
    public void makeCookie(@RequestBody Map<String,String> cookies, HttpServletResponse response) {
        for(String key : cookies.keySet()) {
            Cookie cookie = new Cookie(key, cookies.get(key));
            cookie.setMaxAge(60 * 60 * 60 * 24);
            response.addCookie(cookie);
        }
    }
}
