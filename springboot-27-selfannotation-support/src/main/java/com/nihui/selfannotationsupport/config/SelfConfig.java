package com.nihui.selfannotationsupport.config;

import com.nihui.selfannotationsupport.bean.User;
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
@ConfigurationProperties(value = "nh.self.config")
@Configuration
@Getter
@Setter
public class SelfConfig {

    private String name;
    private String password;
    private String email;


    @Bean
    public User user(){
        User user = new User();
        user.setUsername(name);
        user.setPassword(password);
        user.setEmail(email);
        return user;
    }
}
