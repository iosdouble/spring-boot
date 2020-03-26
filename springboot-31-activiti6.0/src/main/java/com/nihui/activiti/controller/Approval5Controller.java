package com.nihui.activiti.controller;

import com.nihui.activiti.entity.VacTask;
import com.nihui.activiti.entity.Vacation;
import com.nihui.activiti.service.Approval5Service;
import com.nihui.activiti.service.VacationService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.servlet.http.HttpSession;

/**
 * @Classname Approval5Controller
 * @Description TODO
 * @Date 2020/3/25 4:17 PM
 * @Created by nihui
 */
@Api(value = "五级审批",description = "测试一个一个五级审批流程",position = 100,protocols = "http")
@RestController
public class Approval5Controller {

    @Resource
    private Approval5Service approval5Service;

    @Resource
    private VacationService vacationService;

    @PostMapping("/startApval")
    public Object startVac(@RequestBody Vacation vac, HttpSession session) {
        String userName = (String) session.getAttribute("userName");
        return vacationService.startVac(userName, vac);
    }

    @GetMapping("/myApval")
    public Object myVac(HttpSession session) {
        String userName = (String) session.getAttribute("userName");
        return vacationService.myVac(userName);
    }

    @GetMapping("/myAuditApval")
    public Object myAudit(HttpSession session) {
        String userName = (String) session.getAttribute("userName");
        return vacationService.myAudit(userName);
    }

    @PostMapping("/passAuditApval")
    public Object passAudit(HttpSession session, @RequestBody VacTask vacTask) {
        String userName = (String) session.getAttribute("userName");
        return vacationService.passAudit(userName, vacTask);
    }

    @GetMapping("/myVacRecordApval")
    public Object myVacRecord(HttpSession session) {
        String userName = (String) session.getAttribute("userName");
        return vacationService.myVacRecord(userName);
    }

    @GetMapping("/myAuditRecordApval")
    public Object myAuditRecord(HttpSession session) {
        String userName = (String) session.getAttribute("userName");
        return vacationService.myAuditRecord(userName);
    }
}
