package com.nh.mangdatasoruce.dao.mapper.test;

import com.nh.mangdatasoruce.bean.test.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname TestUserMapper
 * @Description TODO
 * @Date 2019/9/3 11:14 AM
 * @Created by nihui
 */
@Mapper
public interface TestUserMapper {

    public List<User> getAllTestUser();
}
