package com.nh.workflow.workflowsupport.dao.bean;

import java.util.Date;

public class FlowService {
    private Integer flowId;

    private Integer flowAllEventNumber;

    private Date updatedTime;

    public FlowService(Integer flowId, Integer flowAllEventNumber, Date updatedTime) {
        this.flowId = flowId;
        this.flowAllEventNumber = flowAllEventNumber;
        this.updatedTime = updatedTime;
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

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}