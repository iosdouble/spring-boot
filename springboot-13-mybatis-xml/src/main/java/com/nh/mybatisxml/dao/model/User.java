package com.nh.mybatisxml.dao.model;

/**
 * @Classname User
 * @Description TODO
 * @Date 2019/9/14 12:26 AM
 * @Created by nihui
 */
public class User {
    private String id;
    private String name;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
