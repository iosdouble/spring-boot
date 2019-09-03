package com.nh.mybatis.bean;

/**
 * @Classname Dog
 * @Description TODO
 * @Date 2019/8/28 4:59 PM
 * @Created by nihui
 */
public class Dog {
    private String dname;
    private Integer age;

    public Dog() {
    }

    public Dog(String dname, Integer age) {
        this.dname = dname;
        this.age = age;
    }


    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
