package com.walter.controller;

import com.walter.bean.User;
import com.walter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {


    @Autowired
    private UserService userService;


    @RequestMapping("/insert")
    @ResponseBody
    public String insert(User user) {
        userService.insert(user);
        return user.toString();
    }

    @RequestMapping("/selectall")
    @ResponseBody
    public String selectall() {
        return userService.selectAll().toString();
    }

}
