package com.nh.workflow.workflowsupport.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Classname ExtFlowDetail
 * @Description TODO
 * @Date 2020/3/27 1:41 PM
 * @Created by nihui
 */
@Deprecated
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExtFlowDetail {
    //流程全局标识
    private Integer flowFinalId;
    //流程中的执行事件
    private List<ExtFlowEventDetail> extFlowEventDetailList;
}
