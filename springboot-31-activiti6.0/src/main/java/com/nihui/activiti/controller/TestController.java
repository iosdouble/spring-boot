package com.nihui.activiti.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2020/3/23 1:49 PM
 * @Created by nihui
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "OK";
    }
}
