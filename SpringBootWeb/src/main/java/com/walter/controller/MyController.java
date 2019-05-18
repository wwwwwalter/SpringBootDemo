package com.walter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @RequestMapping("/springboot")
    @ResponseBody
    public String springboot() {
        System.out.println("done");
        return "hello springboot";
    }
}
