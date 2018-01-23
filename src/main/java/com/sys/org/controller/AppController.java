package com.sys.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Debasish on 22-Jan-18 9:27 PM
 */
@Controller
public class AppController {
    @GetMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
