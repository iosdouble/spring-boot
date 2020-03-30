package com.nh.workflow.workflowsupport.service.impl;

import com.nh.workflow.workflowsupport.bean.ExtFlowDetail;
import com.nh.workflow.workflowsupport.bean.ExtFlowEventDetail;
import com.nh.workflow.workflowsupport.bean.ExtFlowToEvent;
import com.nh.workflow.workflowsupport.dao.bean.EventService;
import com.nh.workflow.workflowsupport.dao.bean.FlowService;
import com.nh.workflow.workflowsupport.dao.bean.FlowToEventRelation;
import com.nh.workflow.workflowsupport.dao.bean.FlowToEventRelationExample;
import com.nh.workflow.workflowsupport.dao.mapper.EventServiceMapper;
import com.nh.workflow.workflowsupport.dao.mapper.FlowServiceMapper;
import com.nh.workflow.workflowsupport.dao.mapper.FlowToEventRelationMapper;
import com.nh.workflow.workflowsupport.service.FlowOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname FlowOperationServiceImpl
 * @Description TODO
 * @Date 2020/3/27 11:36 AM
 * @Created by nihui
 */
@Service
public class FlowOperationServiceImpl implements FlowOperationService {

    @Autowired
    private FlowServiceMapper flowServiceMapper;

    @Autowired
    private EventServiceMapper eventServiceMapper;

    @Autowired
    private FlowToEventRelationMapper flowToEventRelationMapper;

    @Override
    public String addFlow(FlowService flowService) {
        String status = "false";
        int insert = flowServiceMapper.insert(flowService);
        if (insert!=0){
            status = "true";
        }
        return status;
    }

    @Override
    public FlowService getFlowById(Integer flowId) {
        return flowServiceMapper.selectByPrimaryKey(flowId);
    }

    @Deprecated
    @Override
    public ExtFlowDetail getFlowDetailById(Integer flowId) {
        ExtFlowDetail extFlowDetail = new ExtFlowDetail();
        List<ExtFlowEventDetail> extFlowEventDetails = new ArrayList<>();
        FlowService flowService = flowServiceMapper.selectByPrimaryKey(flowId);
        extFlowDetail.setFlowFinalId(flowService.getFlowId());
        FlowToEventRelationExample flowToEventRelationExample = new FlowToEventRelationExample();
        flowToEventRelationExample.createCriteria().andFlowIdEqualTo(flowId);
        flowToEventRelationExample.setOrderByClause("'flow_step DESC'");
        List<FlowToEventRelation> flowToEventRelationList = flowToEventRelationMapper.selectByExample(flowToEventRelationExample);
        for (FlowToEventRelation item:flowToEventRelationList) {
            EventService eventService = eventServiceMapper.selectByPrimaryKey(item.getFlowStepEventId());
            ExtFlowEventDetail extFlowEventDetail = new ExtFlowEventDetail();
            extFlowEventDetail.setEventService(eventService);
            extFlowEventDetail.setFlowId(item.getFlowId());
            extFlowEventDetail.setFlowStep(item.getFlowStep());
            extFlowEventDetails.add(extFlowEventDetail);
        }
        extFlowDetail.setExtFlowEventDetailList(extFlowEventDetails);

        return extFlowDetail;
    }

    @Override
    public List<ExtFlowToEvent> getFlowToEvent(Integer flowId) {
        return flowToEventRelationMapper.flowToEventDetail(flowId);
    }


}
