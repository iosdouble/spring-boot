package com.nihui.activiti.bean;


import lombok.Data;
import org.activiti.engine.impl.persistence.entity.UserEntityImpl;

/**
 * @Classname ExtUser
 * @Description TODO
 * @Date 2020/3/26 2:22 PM
 * @Created by nihui
 */
@Data
public class ExtUser {

    private String ID_;
    private Integer REV_;
    private String FIRST_;
    private String LAST_;
    private String EMAIL_;
    private String PWD_;
    private String PICTURE_ID_;

}
