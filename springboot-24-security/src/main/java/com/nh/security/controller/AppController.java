package com.nh.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname AppController
 * @Description TODO
 * @Date 2020/1/1 11:56 AM
 * @Created by nihui
 */
@RestController
@RequestMapping("/app/api")
public class AppController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello,App";
    }
}
