package com.nihui.activiti.controller;


import io.swagger.annotations.Api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2020/3/23 1:49 PM
 * @Created by nihui
 */
@Api(value = "测试相关" ,description = "测试逻辑",position = 100,protocols = "http")
@RestController
public class TestController {
;
    @GetMapping("/test")
    public String test(){
        return "OK";
    }

}
