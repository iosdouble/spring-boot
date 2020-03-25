package com.nihui.activiti.controller;

import com.nihui.activiti.entity.User;
import com.nihui.activiti.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2020/3/23 2:11 PM
 * @Created by nihui
 */
@Api(value = "用户相关" ,description = "用户的增删改查",position = 100,protocols = "http")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/getAllUser")
    public Object getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/getAllGroup")
    public Object getAllGroup() {
        return userService.getAllGroup();
    }

    @GetMapping("/getUserGroup")
    public Object getUserGroup(String groupId) {
        return userService.getUserGroup(groupId);
    }

    @PostMapping("/addUser")
    public Object addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
