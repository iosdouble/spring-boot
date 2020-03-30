package com.nh.workflow.workflowsupport.controller;

import com.nh.workflow.workflowsupport.bean.ExtFlowDetail;
import com.nh.workflow.workflowsupport.bean.ExtFlowToEvent;
import com.nh.workflow.workflowsupport.dao.bean.FlowService;
import com.nh.workflow.workflowsupport.service.FlowOperationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Classname FlowServiceController
 * @Description TODO
 * @Date 2020/3/27 11:32 AM
 * @Created by nihui
 */
@Api(value = "流程服务支持",description = "用来支持基本流程接口",position = 1000,protocols = "http")
@RestController
public class FlowServiceController {
    @Autowired
    private FlowOperationService flowOperationService;


    @ApiOperation(value = "根据ID获取基础信息")
    @GetMapping("/getFlow")
    public FlowService getFlow(@RequestParam(value = "id") Integer flowId){
        return flowOperationService.getFlowById(flowId);
    }

    @ApiOperation(value = "根据ID获取流程详情信息")
    @GetMapping("/getFlowDetail")
    public ExtFlowDetail getFlowDetail(@RequestParam(value = "id") Integer flowId){
        return flowOperationService.getFlowDetailById(flowId);
    }

    @ApiOperation(value = "根据ID获取流程事件详情")
    @GetMapping("/getFlowtoEvent")
    public List<ExtFlowToEvent> getFlowtoEvent(@RequestParam(value = "id") Integer flowId){
        return flowOperationService.getFlowToEvent(flowId);
    }

}
