package com.nh.mangdatasoruce.controller;

import com.nh.mangdatasoruce.bean.resource.Person;
import com.nh.mangdatasoruce.bean.test.User;
import com.nh.mangdatasoruce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2019/9/3 11:27 AM
 * @Created by nihui
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/testuser")
    public List<User> getUser(){
        return userService.getTestUser();
    }

    @GetMapping("/person")
    public List<Person> getPerson(){
        return userService.getResourceUser();
    }
}
