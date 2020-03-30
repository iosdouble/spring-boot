package com.nh.workflow.workflowsupport.dao.bean;

public class TaskFlowEventRelation {
    private Long id;

    private Long userId;

    private Long taskId;

    private Integer flowId;

    private Integer eventId;

    private String eventDealUser;

    private Integer flowStepCode;

    private Integer isFinish;

    public TaskFlowEventRelation(Long id, Long userId, Long taskId, Integer flowId, Integer eventId, String eventDealUser, Integer flowStepCode, Integer isFinish) {
        this.id = id;
        this.userId = userId;
        this.taskId = taskId;
        this.flowId = flowId;
        this.eventId = eventId;
        this.eventDealUser = eventDealUser;
        this.flowStepCode = flowStepCode;
        this.isFinish = isFinish;
    }

    public TaskFlowEventRelation() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getEventDealUser() {
        return eventDealUser;
    }

    public void setEventDealUser(String eventDealUser) {
        this.eventDealUser = eventDealUser == null ? null : eventDealUser.trim();
    }

    public Integer getFlowStepCode() {
        return flowStepCode;
    }

    public void setFlowStepCode(Integer flowStepCode) {
        this.flowStepCode = flowStepCode;
    }

    public Integer getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(Integer isFinish) {
        this.isFinish = isFinish;
    }
}