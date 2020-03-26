package com.nh.annotation;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.beans.ConstructorProperties;

/**
 * @Classname SelfAnnotationProperties
 * @Description TODO
 * @Date 2020/3/26 10:06 AM
 * @Created by nihui
 */
@ConfigurationProperties(prefix = "nh.log")
@Setter
@Getter
public class SelfAnnotationProperties {
    private String mail;
    private String path;
    private String level;
}
