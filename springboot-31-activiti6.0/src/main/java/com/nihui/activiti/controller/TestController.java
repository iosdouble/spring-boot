package com.nihui.activiti.controller;

import com.nihui.activiti.bean.ExtUser;
import com.nihui.activiti.flowservice.AdapterIdentityServiceImpl;
import io.swagger.annotations.Api;
import org.activiti.engine.identity.User;
import org.activiti.engine.impl.persistence.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private AdapterIdentityServiceImpl adapterIdentityService;
    @GetMapping("/test")
    public String test(){
        return "OK";
    }

    @GetMapping("/user")
    public User user(){
        User user = adapterIdentityService.newUser("1");
//        return adapterIdentityService.getUser("1");
        return user;
    }
}
