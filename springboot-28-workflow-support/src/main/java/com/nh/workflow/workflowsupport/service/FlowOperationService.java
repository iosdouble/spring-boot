package com.nh.workflow.workflowsupport.service;

import com.nh.workflow.workflowsupport.bean.ExtFlowDetail;
import com.nh.workflow.workflowsupport.bean.ExtFlowToEvent;
import com.nh.workflow.workflowsupport.dao.bean.FlowService;

import java.util.List;

/**
 * @Classname FlowOperationService
 * @Description TODO
 * @Date 2020/3/27 11:35 AM
 * @Created by nihui
 */
public interface FlowOperationService {

    public String addFlow(FlowService flowService);

    public FlowService getFlowById(Integer flowId);

    public ExtFlowDetail getFlowDetailById(Integer flowId);

    public List<ExtFlowToEvent> getFlowToEvent(Integer flowId);
}
