package com.example.surgehacksproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }


    @RequestMapping("/camera")
    public String camera() {
        return "camera";
    }
}
