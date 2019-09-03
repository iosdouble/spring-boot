package com.nh.mybatis.controller;

import com.nh.mybatis.bean.Person;
import com.nh.mybatis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname PersonController
 * @Description TODO
 * @Date 2019/8/27 4:47 PM
 * @Created by nihui
 */
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable Integer id){
        return personService.getUserById(id);
    }

    @GetMapping("/add/{id}/{name}/{password}")
    public int addPerson(@PathVariable Integer id,@PathVariable String name,@PathVariable String password){
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setPassword(password);
        return personService.addUser(person);
    }

    @GetMapping("/update/{id}/{name}/{password}")
    public int updatePerson(@PathVariable Integer id,@PathVariable String name,@PathVariable String password){
        Person person = new Person();
        person.setId(id);
        person.setName(name);
        person.setPassword(password);
        return personService.updateUser(person);
    }
}
