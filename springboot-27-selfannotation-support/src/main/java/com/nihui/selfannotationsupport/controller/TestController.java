package com.nihui.selfannotationsupport.controller;

import com.nihui.selfannotationsupport.bean.User;
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
    private User user;
    @GetMapping("/hello")
    public User getUser(){
        return user;
    }
}
