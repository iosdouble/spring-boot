package com.nh.mangdatasoruce.bean.resource;

/**
 * @Classname User
 * @Description TODO
 * @Date 2019/9/3 11:17 AM
 * @Created by nihui
 */
public class Person {
    private Integer id;
    private String username;
    private String password;
    private String public_salt;
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPublic_salt() {
        return public_salt;
    }

    public void setPublic_salt(String public_salt) {
        this.public_salt = public_salt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
