package com.nh.mybatisxml.dao.mapper;

import com.nh.mybatisxml.dao.model.User;

import java.util.List;

/**
 * @Classname UserMapper
 * @Description TODO
 * @Date 2019/9/14 12:24 AM
 * @Created by nihui
 */
public interface UserMapper {
    public List<User> getAllUser();

    public User getUserById(String id);

    public int addUser(User user);

    public int updateUser(User user);

    public int deleteUserById(String id);
}
