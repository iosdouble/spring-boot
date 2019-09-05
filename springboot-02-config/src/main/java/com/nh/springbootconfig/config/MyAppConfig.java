package com.nh.springbootconfig.config;

import com.nh.springbootconfig.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname MyAppConfig
 * @Description TODO
 * @Date 2019/9/5 7:52 PM
 * @Created by nihui
 *
 * @Configuration 表明这就是一个自定义的配置类，在配置文件中使用的是Bean标签来往容器中添加组件
 * 而在配置类中使用的@Bean注解来实现配置标签配置。
 *
 */
@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService(){
        return new HelloService();
    }

}
