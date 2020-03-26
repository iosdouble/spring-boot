package com.nihui.selfannotationsupport.config;

import com.nihui.selfannotationsupport.bean.Test;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname SelfConfig
 * @Description TODO
 * @Date 2020/3/25 4:39 PM
 * @Created by nihui
 */
@ConfigurationProperties(prefix = "nh.self.config")
@Configuration
@Getter
@Setter
public class SelfConfig {

    private String name;
    private String password;
    private String email;


    @Bean
    public Test user(){
        Test test = new Test();
        test.setUsername(name);
        test.setPassword(password);
        test.setEmail(email);
        return test;
    }
}
