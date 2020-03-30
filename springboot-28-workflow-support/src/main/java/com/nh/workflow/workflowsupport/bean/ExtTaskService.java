package com.nh.workflow.workflowsupport.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Classname ExtTaskService
 * @Description TODO
 * @Date 2020/3/27 4:18 PM
 * @Created by nihui
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExtTaskService {

    private Integer flowId;
    private Long usercode;
    private String taskDetail;
}
