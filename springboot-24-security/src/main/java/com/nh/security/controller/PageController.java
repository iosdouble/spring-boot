package com.nh.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2020/1/1 11:07 AM
 * @Created by nihui
 */
//@Controller
public class PageController {

    @RequestMapping("/login")
    public String hello(){
        return "login";
    }

    @GetMapping
    public String login(){
        return "login";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

}
