package com.nh.workflow.workflowsupport.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname ExtFlowToEvent
 * @Description TODO
 * @Date 2020/3/27 3:09 PM
 * @Created by nihui
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExtFlowToEvent {

    private Integer flowId;
    private Integer flowStepEventId;
    private Integer eventId;
    private String eventCode;
    private String eventDescribe;
    private Integer eventLevel;
    private Integer flowStep;
}
