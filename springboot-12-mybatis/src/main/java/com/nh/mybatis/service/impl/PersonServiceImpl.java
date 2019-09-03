package com.nh.mybatis.service.impl;

import com.nh.mybatis.bean.Person;
import com.nh.mybatis.dao.mapper.PersonMapper;
import com.nh.mybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname PersonServiceImpl
 * @Description TODO
 * @Date 2019/8/27 4:46 PM
 * @Created by nihui
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;


    @Override
    public Person getUserById(Integer id) {
        return personMapper.selectPerson(id);
    }

    @Override
    public int addUser(Person person) {
        return personMapper.insertPerson(person);
    }

    @Override
    public int updateUser(Person person) {
        return personMapper.updateUser(person);
    }
}
