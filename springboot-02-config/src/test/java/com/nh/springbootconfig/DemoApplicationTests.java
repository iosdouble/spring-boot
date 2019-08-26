package com.nh.springbootconfig;

import com.nh.springbootconfig.bean.Nihui;
import com.nh.springbootconfig.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private Person person;
    @Autowired
    private Nihui nihui;

    @Test
    public void contextLoads() {
        System.out.println(nihui);
    }

}
