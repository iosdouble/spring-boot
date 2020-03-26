package com.nh.workflow.workflowsupport.dao.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TaskService {
    private Integer taskId;

    private Integer taskStep;

    @JsonFormat(pattern = "yyyy-mm-dd HH:MM:ss")
    private Date taskCreateTime;

    @JsonFormat(pattern = "yyyy-mm-dd HH:MM:ss")
    private Date taskUpdateTime;

    @JsonFormat(pattern = "yyyy-mm-dd HH:MM:ss")
    private Date taskFinishTime;

    private Integer taskEventFlag;

    private Integer taskOperateMark;

    private Integer userId;

    private String taskDetail;

    public TaskService(Integer taskId, Integer taskStep, Date taskCreateTime, Date taskUpdateTime, Date taskFinishTime, Integer taskEventFlag, Integer taskOperateMark, Integer userId, String taskDetail) {
        this.taskId = taskId;
        this.taskStep = taskStep;
        this.taskCreateTime = taskCreateTime;
        this.taskUpdateTime = taskUpdateTime;
        this.taskFinishTime = taskFinishTime;
        this.taskEventFlag = taskEventFlag;
        this.taskOperateMark = taskOperateMark;
        this.userId = userId;
        this.taskDetail = taskDetail;
    }

    public TaskService(Integer taskId, Integer taskStep, Date taskCreateTime, Date taskUpdateTime, Date taskFinishTime, Integer taskEventFlag, Integer taskOperateMark, Integer userId) {
        this.taskId = taskId;
        this.taskStep = taskStep;
        this.taskCreateTime = taskCreateTime;
        this.taskUpdateTime = taskUpdateTime;
        this.taskFinishTime = taskFinishTime;
        this.taskEventFlag = taskEventFlag;
        this.taskOperateMark = taskOperateMark;
        this.userId = userId;
    }

    public TaskService() {
        super();
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getTaskStep() {
        return taskStep;
    }

    public void setTaskStep(Integer taskStep) {
        this.taskStep = taskStep;
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

    public Integer getTaskEventFlag() {
        return taskEventFlag;
    }

    public void setTaskEventFlag(Integer taskEventFlag) {
        this.taskEventFlag = taskEventFlag;
    }

    public Integer getTaskOperateMark() {
        return taskOperateMark;
    }

    public void setTaskOperateMark(Integer taskOperateMark) {
        this.taskOperateMark = taskOperateMark;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail == null ? null : taskDetail.trim();
    }
}