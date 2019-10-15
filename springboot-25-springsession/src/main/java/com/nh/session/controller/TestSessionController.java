package com.nh.session.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname TestSessionController
 * @Description TODO 测试Session请求
 * @Date 2019/9/25 6:47 PM
 * @Created by nihui
 */
@Controller
public class TestSessionController {

    @RequestMapping(value = "/setSession")
    public Map<String ,Object> setSession(HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        request.getSession().setAttribute("message",request.getRequestURL());
        map.put("request url",request.getRequestURL());
        return map;
    }

    @RequestMapping(value = "/getSession")
    public Object getSesssion(HttpServletRequest request){
        Map<String,Object> map = new HashMap<>();
        map.put("sessionId",request.getSession().getId());
        map.put("message",request.getSession().getAttribute("message"));
        return map;
    }
}
