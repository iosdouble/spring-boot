package com.nh.restful.dao;

import com.nh.restful.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname UserMapper
 * @Description TODO
 * @Date 2019/9/8 11:44 AM
 * @Created by nihui
 */
@Mapper
public interface UserMapper {

    public int addUser(User user);

    public List<User> getAllUser();

    public User getUser(Integer id);

    public int updateUser(User user);

    public int deleteUser(Integer id);

}
