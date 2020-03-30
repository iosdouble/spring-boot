package com.nh.workflow.workflowsupport.controller;

import com.nh.workflow.workflowsupport.bean.ExtTaskService;
import com.nh.workflow.workflowsupport.dao.bean.TaskService;
import com.nh.workflow.workflowsupport.service.TaskOperationServcie;
import com.nh.workflow.workflowsupport.util.IdWorker;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname TaskServiceController
 * @Description TODO
 * @Date 2020/3/26 5:47 PM
 * @Created by nihui
 */
@Api(value = "任务服务支持",description = "用来支持基本任务接口",position = 1000,protocols = "http")
@RestController
public class TaskServiceController {

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private TaskOperationServcie taskOptationServcie;

    @ApiOperation(value = "根据任务ID获取一条数据")
    @GetMapping("/getTask")
    public List<TaskService> getTask(){
        return taskOptationServcie.getTaskServcieByID(1L);
    }

    @ApiOperation(value = "开启任务")
    @PostMapping("/addTask")
    public String addTask(@RequestBody ExtTaskService extTaskService){

        return taskOptationServcie.addOneTask(extTaskService,extTaskService.getFlowId());
    }
    @ApiOperation(value = "测试ID生成器")
    @GetMapping("/id")
    public Long id(){
        return idWorker.nextId();
    }

}
