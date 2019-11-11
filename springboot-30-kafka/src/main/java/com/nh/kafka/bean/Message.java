package com.nh.kafka.bean;

import java.util.Date;

/**
 * @Classname Message
 * @Description TODO
 * @Date 2019/10/18 6:00 PM
 * @Created by nihui
 */
public class Message {
    private Long Id;
    private String Msg;
    private Date SendTime;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getMsg() {
        return Msg;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public Date getSendTime() {
        return SendTime;
    }

    public void setSendTime(Date sendTime) {
        SendTime = sendTime;
    }
}
