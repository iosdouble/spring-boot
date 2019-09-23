package com.nh.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Classname PageController
 * @Description TODO
 * @Date 2019/9/22 8:49 PM
 * @Created by nihui
 */
@Controller
public class PageController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/content")
    public String content(){
        return "content";
    }

//    @RequestMapping(value = "/login",method = RequestMethod.POST);
//    @PostMapping
    @GetMapping
    public String login(){
        return "login";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }
}
