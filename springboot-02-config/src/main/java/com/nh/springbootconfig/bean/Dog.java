package com.nh.springbootconfig.bean;

/**
 * @Classname Dog
 * @Description TODO
 * @Date 2019/8/22 11:10 AM
 * @Created by nihui
 */
public class Dog {
    private String name;
    private Integer age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
