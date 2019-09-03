package com.nh.mangdatasoruce.service.impl;

import com.nh.mangdatasoruce.bean.resource.Person;
import com.nh.mangdatasoruce.bean.test.User;
import com.nh.mangdatasoruce.dao.mapper.resource.ResourceUserMapper;
import com.nh.mangdatasoruce.dao.mapper.test.TestUserMapper;
import com.nh.mangdatasoruce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2019/9/3 11:26 AM
 * @Created by nihui
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private ResourceUserMapper resourceUserMapper;

    @Autowired
    private TestUserMapper testUserMapper;
    @Override
    public List<User> getTestUser() {
        return testUserMapper.getAllTestUser();
    }

    @Override
    public List<Person> getResourceUser() {
        return resourceUserMapper.getAllResourceUser();
    }
}
