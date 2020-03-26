package com.nh.workflow.workflowsupport.service;

import com.nh.workflow.workflowsupport.dao.bean.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname TaskOptationServcie
 * @Description TODO
 * @Date 2020/3/26 5:42 PM
 * @Created by nihui
 */

public interface TaskOptationServcie {

    public List<TaskService> getTaskServcieByID(Integer taskId);
}
