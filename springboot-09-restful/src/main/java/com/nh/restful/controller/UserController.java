package com.nh.restful.controller;

import com.nh.restful.bean.User;
import com.nh.restful.service.UserService;
import io.swagger.annotations.*;
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
@Api(value = "用户",description = "用户操作API",position = 100,protocols = "http")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(
            value = "获取用户列表",
            notes = "获取所有用户信息",
            produces = "application/json,application/xml",
            consumes = "application/json,application/xml",
            response = List.class
    )
    @GetMapping("/allUser")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @ApiOperation(value = "获取用户信息",notes = "获取单个用户的信息")
    @ApiResponses({
            @ApiResponse(code=100,message = "请求参数有错"),
            @ApiResponse(code=101,message = "未授权"),
            @ApiResponse(code=103,message = "禁止访问"),
            @ApiResponse(code=104,message = "请求路径不存在"),
            @ApiResponse(code=105,message = "服务器内部错误"),
    })
    @GetMapping("/getOneUser")
    public User getUserById(@RequestParam Integer id){
        return userService.getUserById(id);
    }

    @ApiOperation(value = "增加用户操作",notes = "用户创建用户接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户ID",required = true,dataType = "Integer",paramType = "query"),
            @ApiImplicitParam(name = "name",value = "用户名",required = true,dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "password",value = "密码",required = true,dataType = "String",paramType = "query")
    })
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
