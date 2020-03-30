package com.nh.workflow.workflowsupport.bean;

import com.nh.workflow.workflowsupport.dao.bean.EventService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname ExtFlowEventDetail
 * @Description TODO
 * @Date 2020/3/27 1:44 PM
 * @Created by nihui
 */
@Deprecated
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExtFlowEventDetail {
    //所属的流程
    private Integer flowId;
    //属于该流程第几步
    private Integer flowStep;
    //事件详情信息
    private EventService eventService;
}
