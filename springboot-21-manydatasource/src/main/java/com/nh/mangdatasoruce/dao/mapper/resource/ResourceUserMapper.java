package com.nh.mangdatasoruce.dao.mapper.resource;

import com.nh.mangdatasoruce.bean.resource.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname ResourceUserMapper
 * @Description TODO
 * @Date 2019/9/3 11:14 AM
 * @Created by nihui
 */
@Mapper
public interface ResourceUserMapper {
    public List<Person> getAllResourceUser();
}
