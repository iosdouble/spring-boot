package com.nh.workflow.workflowsupport.dao.bean;

public class FlowService {
    private Integer flowId;

    private Integer flowAllEventNumber;

    private String flowDescribe;

    public FlowService(Integer flowId, Integer flowAllEventNumber, String flowDescribe) {
        this.flowId = flowId;
        this.flowAllEventNumber = flowAllEventNumber;
        this.flowDescribe = flowDescribe;
    }

    public FlowService() {
        super();
    }

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public Integer getFlowAllEventNumber() {
        return flowAllEventNumber;
    }

    public void setFlowAllEventNumber(Integer flowAllEventNumber) {
        this.flowAllEventNumber = flowAllEventNumber;
    }

    public String getFlowDescribe() {
        return flowDescribe;
    }

    public void setFlowDescribe(String flowDescribe) {
        this.flowDescribe = flowDescribe == null ? null : flowDescribe.trim();
    }
}