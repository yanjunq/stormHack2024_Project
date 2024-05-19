package com.example.surgehacksproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("")
    public String home() {return "home"; }

    @RequestMapping("/camera")
    public String camera() {
        return "camera";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}
