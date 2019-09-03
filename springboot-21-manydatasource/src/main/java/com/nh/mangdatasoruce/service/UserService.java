package com.nh.mangdatasoruce.service;

import com.nh.mangdatasoruce.bean.resource.Person;
import com.nh.mangdatasoruce.bean.test.User;

import java.util.List;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2019/9/3 11:23 AM
 * @Created by nihui
 */
public interface UserService {
    public List<User> getTestUser();

    public List<Person> getResourceUser();
}
