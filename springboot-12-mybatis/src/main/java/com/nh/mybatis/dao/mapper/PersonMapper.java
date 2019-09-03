package com.nh.mybatis.dao.mapper;

import com.nh.mybatis.bean.Person;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname PersonMapper
 * @Description TODO
 * @Date 2019/8/27 4:44 PM
 * @Created by nihui
 */
@Mapper
public interface PersonMapper {
    public Person selectPerson(Integer id);

    public int insertPerson(Person person);

    public int updateUser(Person person);
}
