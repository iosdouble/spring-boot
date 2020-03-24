package com.nihui.activiti.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Classname Vacation
 * @Description TODO
 * @Date 2020/3/23 1:57 PM
 * @Created by nihui
 */
@Data
public class Vacation {

    /**
     * 申请人
     */
    private String applyUser;
    private int days;
    private String reason;
    private Date applyTime;
    private String applyStatus;

    /**
     * 审核人
     */
    private String auditor;
    private String result;
    private Date auditTime;
}
