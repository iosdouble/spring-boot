package com.nh.springbootconfig;

import com.nh.springbootconfig.bean.Nihui;
import com.nh.springbootconfig.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private Person person;
    @Autowired
    private Nihui nihui;

//    @Autowired
//    private ApplicationContext applicationContext;
//    @Test
//    public void testHelloService(){
//        boolean helloService = applicationContext.containsBean("helloService");
//        System.out.println(helloService);
//    }
    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
