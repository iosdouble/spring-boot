package com.nihui.selfannotationsupport.controller;

import com.nihui.selfannotationsupport.bean.Test;
import com.nh.bean.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2020/3/25 4:44 PM
 * @Created by nihui
 */
@RestController
public class TestController {

    @Autowired
    private Test user;

    @Autowired
    private Log log;

    @GetMapping("/hello")
    public Test getUser(){
        return user;
    }

    @GetMapping("/log")
    public Log getLog(){
        return log;
    }
}
