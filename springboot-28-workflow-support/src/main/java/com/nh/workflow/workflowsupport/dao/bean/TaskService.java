package com.nh.workflow.workflowsupport.dao.bean;

import java.util.Date;

public class TaskService {
    private Long id;

    private Long taskId;

    private Long userId;

    private Integer taskAllStep;

    private Date taskCreateTime;

    private Date taskUpdateTime;

    private Date taskFinishTime;

    private Integer taskEventId;

    private Integer taskOperateFlowId;

    private String taskDetail;

    public TaskService(Long id, Long taskId, Long userId, Integer taskAllStep, Date taskCreateTime, Date taskUpdateTime, Date taskFinishTime, Integer taskEventId, Integer taskOperateFlowId, String taskDetail) {
        this.id = id;
        this.taskId = taskId;
        this.userId = userId;
        this.taskAllStep = taskAllStep;
        this.taskCreateTime = taskCreateTime;
        this.taskUpdateTime = taskUpdateTime;
        this.taskFinishTime = taskFinishTime;
        this.taskEventId = taskEventId;
        this.taskOperateFlowId = taskOperateFlowId;
        this.taskDetail = taskDetail;
    }

    public TaskService() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getTaskAllStep() {
        return taskAllStep;
    }

    public void setTaskAllStep(Integer taskAllStep) {
        this.taskAllStep = taskAllStep;
    }

    public Date getTaskCreateTime() {
        return taskCreateTime;
    }

    public void setTaskCreateTime(Date taskCreateTime) {
        this.taskCreateTime = taskCreateTime;
    }

    public Date getTaskUpdateTime() {
        return taskUpdateTime;
    }

    public void setTaskUpdateTime(Date taskUpdateTime) {
        this.taskUpdateTime = taskUpdateTime;
    }

    public Date getTaskFinishTime() {
        return taskFinishTime;
    }

    public void setTaskFinishTime(Date taskFinishTime) {
        this.taskFinishTime = taskFinishTime;
    }

    public Integer getTaskEventId() {
        return taskEventId;
    }

    public void setTaskEventId(Integer taskEventId) {
        this.taskEventId = taskEventId;
    }

    public Integer getTaskOperateFlowId() {
        return taskOperateFlowId;
    }

    public void setTaskOperateFlowId(Integer taskOperateFlowId) {
        this.taskOperateFlowId = taskOperateFlowId;
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail == null ? null : taskDetail.trim();
    }
}