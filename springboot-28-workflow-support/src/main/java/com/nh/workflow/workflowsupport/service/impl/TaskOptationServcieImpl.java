package com.nh.workflow.workflowsupport.service.impl;


import com.nh.workflow.workflowsupport.dao.bean.TaskService;
import com.nh.workflow.workflowsupport.dao.bean.TaskServiceExample;
import com.nh.workflow.workflowsupport.dao.mapper.TaskServiceMapper;
import com.nh.workflow.workflowsupport.service.TaskOptationServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname TaskOptationServcieImpl
 * @Description TODO
 * @Date 2020/3/26 5:43 PM
 * @Created by nihui
 */
@Service
public class TaskOptationServcieImpl implements TaskOptationServcie {
    @Autowired
    private TaskServiceMapper taskServiceMapper;
    @Override
    public List<TaskService> getTaskServcieByID(Integer taskId) {
        TaskServiceExample taskServiceExample = new TaskServiceExample();
        taskServiceExample.createCriteria().andTaskIdEqualTo(taskId);
        List<TaskService> list =  taskServiceMapper.selectByExampleWithBLOBs(taskServiceExample);
        return list;
    }
}
