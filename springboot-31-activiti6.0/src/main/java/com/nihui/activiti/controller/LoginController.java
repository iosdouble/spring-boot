package com.nihui.activiti.controller;

import com.nihui.activiti.entity.User;
import com.nihui.activiti.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


/**
 * @Classname LoginController
 * @Description TODO
 * @Date 2020/3/23 1:51 PM
 * @Created by nihui
 */
@Api(value = "登录相关" ,description = "用户登录/退出接口",position = 100,protocols = "http")
@Controller
public class LoginController {

    @Resource
    private UserService userService;

    @ApiOperation(
            value = "用户登录操作"
    )
    @PostMapping("/login")
    @ResponseBody
    public boolean login(HttpSession session, @RequestBody User user) {
        String userName = user.getUserName();
        String password = user.getPassword();
        boolean login = userService.login(userName, password);
        if (login) {
            session.setAttribute("userName", userName);
            return true;
        }
        return false;
    }

    @ApiOperation(
            value = "用户退出操作"
    )
    @GetMapping("/exit")
    public String exit(HttpSession session) {
        session.removeAttribute("userName");
        return "login";
    }
}
