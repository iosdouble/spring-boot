package com.nh.restful.controller;

import com.nh.restful.bean.User;
import com.nh.restful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2019/9/8 11:53 AM
 * @Created by nihui
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/getOneUser")
    public User getUserById(@RequestParam Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("/addUser")
    public int addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @DeleteMapping("/deleteUser")
    public int deleteUser(Integer id){
        return userService.deleteUserById(id);
    }

    @PatchMapping("/updateUser")
    public int updateUser(@RequestBody  User user){
        return userService.updateUser(user);
    }

}
