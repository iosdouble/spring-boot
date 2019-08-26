package com.nh.springbootconfig.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Classname Nihui
 * @Description TODO
 * @Date 2019/8/26 6:35 PM
 * @Created by nihui
 */
@Component
public class Nihui {
    @Value("${person.last-name}")
    private String lastName;
    @Value("#{11*2}")
    private Integer age;
    @Value("true")
    private boolean boss;

    @Override
    public String toString() {
        return "Nihui{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                '}';
    }
}
