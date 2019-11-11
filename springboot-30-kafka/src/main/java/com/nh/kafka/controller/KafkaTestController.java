package com.nh.kafka.controller;

import com.nh.kafka.producer.KfkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname KafkaTestController
 * @Description TODO
 * @Date 2019/10/18 6:05 PM
 * @Created by nihui
 */

@Controller
public class KafkaTestController {

    @Autowired
    private KfkaProducer producer;

    @RequestMapping("/testSendMsg")
    @ResponseBody
    public String testSendMsg(){
        producer.send();
        return "success";
    }
}
