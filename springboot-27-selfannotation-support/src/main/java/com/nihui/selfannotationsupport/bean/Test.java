package com.nihui.selfannotationsupport.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Classname User
 * @Description TODO
 * @Date 2020/3/25 4:44 PM
 * @Created by nihui
 */
public class Test {
    private String username;
    private String password;
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
