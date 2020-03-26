package com.nh.workflow.workflowsupport.controller;

import com.nh.workflow.workflowsupport.dao.bean.TaskService;
import com.nh.workflow.workflowsupport.service.TaskOptationServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname TaskServiceController
 * @Description TODO
 * @Date 2020/3/26 5:47 PM
 * @Created by nihui
 */
@RestController
public class TaskServiceController {

    @Autowired
    private TaskOptationServcie taskOptationServcie;

    @GetMapping("/hello")
    public List<TaskService> getTask(){
        return taskOptationServcie.getTaskServcieByID(1);
    }
}
