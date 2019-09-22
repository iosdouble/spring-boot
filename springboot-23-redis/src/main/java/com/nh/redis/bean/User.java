package com.nh.redis.bean;

/**
 * @Classname User
 * @Description TODO
 * @Date 2019/9/22 6:30 PM
 * @Created by nihui
 */
public class User {
    private String username;
    private Integer age;
    private String email;

    public User(String username, Integer age, String email) {
        this.username = username;
        this.age = age;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
