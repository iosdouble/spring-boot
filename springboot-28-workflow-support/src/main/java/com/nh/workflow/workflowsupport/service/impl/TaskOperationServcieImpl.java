package com.nh.workflow.workflowsupport.service.impl;


import com.nh.workflow.workflowsupport.bean.ExtFlowToEvent;
import com.nh.workflow.workflowsupport.bean.ExtTaskService;
import com.nh.workflow.workflowsupport.dao.bean.TaskFlowEventRelation;
import com.nh.workflow.workflowsupport.dao.bean.TaskService;
import com.nh.workflow.workflowsupport.dao.bean.TaskServiceExample;
import com.nh.workflow.workflowsupport.dao.mapper.FlowServiceMapper;
import com.nh.workflow.workflowsupport.dao.mapper.FlowToEventRelationMapper;
import com.nh.workflow.workflowsupport.dao.mapper.TaskFlowEventRelationMapper;
import com.nh.workflow.workflowsupport.dao.mapper.TaskServiceMapper;
import com.nh.workflow.workflowsupport.service.TaskOperationServcie;
import com.nh.workflow.workflowsupport.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @Classname TaskOptationServcieImpl
 * @Description TODO
 * @Date 2020/3/26 5:43 PM
 * @Created by nihui
 */
@Service
@Transactional
public class TaskOperationServcieImpl implements TaskOperationServcie {

    @Autowired
    private IdWorker idWorker;

    /**
     * 创建任务Mapper
     */
    @Autowired
    private TaskServiceMapper taskServiceMapper;

    /**
     * 任务流程事件绑定Mapper
     */
    @Autowired
    private TaskFlowEventRelationMapper taskFlowEventRelationMapper;

    /**
     * 流程事件处理Mapper
     */
    @Autowired
    private FlowToEventRelationMapper flowToEventRelationMapper;



    @Override
    public List<TaskService> getTaskServcieByID(Long taskId) {
        TaskServiceExample taskServiceExample = new TaskServiceExample();
        taskServiceExample.createCriteria().andTaskIdEqualTo(taskId);
        List<TaskService> list =  taskServiceMapper.selectByExampleWithBLOBs(taskServiceExample);
        return list;
    }

    /**
     * 将任务添加到指定的流程中
     * @param extTaskService
     * @param flowId
     * @return
     */
    @Override
    public String addOneTask(ExtTaskService extTaskService, Integer flowId) {

        List<ExtFlowToEvent> extFlowToEvents = flowToEventRelationMapper.flowToEventDetail(flowId);

        Long taskId = idWorker.nextId();
        TaskService taskService = new TaskService();
        taskService.setId(idWorker.nextId());
        taskService.setTaskAllStep(extFlowToEvents.size());
        taskService.setTaskCreateTime(new Date());
        taskService.setTaskEventId(1);
        taskService.setTaskId(taskId);
        taskService.setUserId(extTaskService.getUsercode());
        taskService.setTaskDetail(extTaskService.getTaskDetail());
        taskService.setTaskOperateFlowId(flowId);

        for (ExtFlowToEvent item:extFlowToEvents) {
            TaskFlowEventRelation taskFlowEventRelation = new TaskFlowEventRelation();
            taskFlowEventRelation.setId(idWorker.nextId());
            taskFlowEventRelation.setFlowId(flowId);
            taskFlowEventRelation.setUserId(extTaskService.getUsercode());
            taskFlowEventRelation.setTaskId(taskId);
            taskFlowEventRelation.setEventId(item.getEventId());
            taskFlowEventRelation.setFlowStepCode(item.getFlowStep());
            taskFlowEventRelation.setEventDealUser("nihui");
            taskFlowEventRelation.setIsFinish(0);
            taskFlowEventRelationMapper.insert(taskFlowEventRelation);
        }



        String state = "false";
        int insert = taskServiceMapper.insert(taskService);

        if (insert!=0){
            state = "true";
        }
        return state;
    }

    /**
     * 获取整个任务的流程详情
     * @param taskId
     * @return
     */
    @Override
    public List<TaskFlowEventRelation> getTaskFlowDetails(Long taskId) {
        return null;
    }

    /**
     * 根据用户ID和完成状态获取对应审批信息
     * @param userId
     * @param isFinish
     * @return
     */
    @Override
    public TaskService getTaskByUserID(Integer userId, Integer isFinish) {
        return null;
    }

    /**
     * 根据用户ID，执行流程ID，执行任务ID查询对应任务执行流程信息
     * @param userId
     * @param flowId
     * @param taskId
     * @return
     */
    @Override
    public TaskFlowEventRelation getTaskFlowDetails(Integer userId, Integer flowId, Long taskId) {
        return null;
    }

}
