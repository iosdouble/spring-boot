package com.nh.mybatis.service;

import com.nh.mybatis.bean.Person;

/**
 * @Classname PersonService
 * @Description TODO
 * @Date 2019/8/27 4:45 PM
 * @Created by nihui
 */
public interface PersonService {
    public Person getUserById(Integer id);

    public int addUser(Person person);

    public int updateUser(Person person);
}
