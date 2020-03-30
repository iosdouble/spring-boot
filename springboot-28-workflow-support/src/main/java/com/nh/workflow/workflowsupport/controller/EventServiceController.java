package com.nh.workflow.workflowsupport.controller;

import com.nh.workflow.workflowsupport.dao.bean.EventService;
import com.nh.workflow.workflowsupport.dao.bean.TaskService;
import com.nh.workflow.workflowsupport.service.EventOperationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Classname EventServiceController
 * @Description TODO
 * @Date 2020/3/27 11:31 AM
 * @Created by nihui
 */
@Api(value = "事件服务支持",description = "用来支持基本事件接口",position = 1000,protocols = "http")
@RestController
public class EventServiceController {

    @Autowired
    private EventOperationService eventOperationService;

    @ApiOperation(value = "添加一条事件")
    @PostMapping("/addEvent")
    public String addEvent(@RequestBody EventService eventService){
        return eventOperationService.addEvent(eventService);
    }
    @ApiOperation(value = "根据id获取一条事件描述")
    @GetMapping("/getEvent")
    public EventService getEvent(@RequestParam(value = "id") Integer eventId){
        return eventOperationService.getEventById(eventId);
    }
}
