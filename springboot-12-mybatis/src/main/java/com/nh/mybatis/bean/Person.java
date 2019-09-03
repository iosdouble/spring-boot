package com.nh.mybatis.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Classname Person
 * @Description TODO
 * @Date 2019/8/27 4:42 PM
 * @Created by nihui
 */
//@Getter
//@Setter
//@Data
public class Person {
    private Integer id;
    private String name;
    private String password;

    private Dog dog;

    public Person() {
    }

    public Person(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
