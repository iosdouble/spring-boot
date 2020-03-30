package com.nh.workflow.workflowsupport.dao.bean;

public class FlowToEventRelation {
    private Integer realId;

    private Integer flowId;

    private Integer flowStep;

    private Integer flowStepEventId;

    public FlowToEventRelation(Integer realId, Integer flowId, Integer flowStep, Integer flowStepEventId) {
        this.realId = realId;
        this.flowId = flowId;
        this.flowStep = flowStep;
        this.flowStepEventId = flowStepEventId;
    }

    public FlowToEventRelation() {
        super();
    }

    public Integer getRealId() {
        return realId;
    }

    public void setRealId(Integer realId) {
        this.realId = realId;
    }

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public Integer getFlowStep() {
        return flowStep;
    }

    public void setFlowStep(Integer flowStep) {
        this.flowStep = flowStep;
    }

    public Integer getFlowStepEventId() {
        return flowStepEventId;
    }

    public void setFlowStepEventId(Integer flowStepEventId) {
        this.flowStepEventId = flowStepEventId;
    }
}