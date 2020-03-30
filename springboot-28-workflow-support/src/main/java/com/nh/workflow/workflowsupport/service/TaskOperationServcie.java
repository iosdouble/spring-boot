package com.nh.workflow.workflowsupport.service;

import com.nh.workflow.workflowsupport.bean.ExtFlowToEvent;
import com.nh.workflow.workflowsupport.bean.ExtTaskService;
import com.nh.workflow.workflowsupport.dao.bean.TaskFlowEventRelation;
import com.nh.workflow.workflowsupport.dao.bean.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname TaskOptationServcie
 * @Description TODO
 * @Date 2020/3/26 5:42 PM
 * @Created by nihui
 */

public interface TaskOperationServcie {

    public List<TaskService> getTaskServcieByID(Long taskId);

    public String addOneTask(ExtTaskService extTaskService, Integer flowId);

    public List<TaskFlowEventRelation> getTaskFlowDetails(Long taskId);

    public TaskService getTaskByUserID(Integer userId,Integer isFinish);

    public TaskFlowEventRelation getTaskFlowDetails(Integer userId,Integer flowId,Long taskId);
}
