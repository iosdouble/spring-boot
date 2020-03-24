package com.nihui.activiti.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Classname VacTask
 * @Description TODO
 * @Date 2020/3/23 1:57 PM
 * @Created by nihui
 */
@Data
public class VacTask {
    private String id;
    private String name;
    private Vacation vac;
    private Date createTime;
}
