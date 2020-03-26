package com.nh.annotation;

import com.nh.bean.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname SelfAutoConfiguration
 * @Description TODO
 * @Date 2020/3/26 10:05 AM
 * @Created by nihui
 */
@Configuration
@ConditionalOnProperty(prefix = "nh.log", name = "enabled", havingValue = "true", matchIfMissing = false)
@EnableConfigurationProperties(SelfAnnotationProperties.class)
public class SelfAutoConfiguration {

    @Autowired
    private SelfAnnotationProperties properties;

    @Bean
    public Log log(){
        Log log = new Log();
        log.setMail(properties.getMail());
        log.setPath(properties.getPath());
        log.setLevel(properties.getLevel());
        return log;
    }
}
