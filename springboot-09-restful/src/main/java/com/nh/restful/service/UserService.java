package com.nh.restful.service;

import com.nh.restful.bean.User;

import java.util.List;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2019/9/8 11:49 AM
 * @Created by nihui
 */
public interface UserService {

    public int addUser(User user);

    public List<User> getAllUser();

    public User getUserById(Integer id);

    public int updateUser(User user);

    public int deleteUserById(Integer id);

}
