package com.nihui.activiti.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @Classname MvcConfig
 * @Description TODO
 * @Date 2020/3/23 1:21 PM
 * @Created by nihui
 */
//@EnableWebMvc
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
        super.addResourceHandlers(registry);
    }



    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index");
        registry.addViewController("/user");
//        registry.addRedirectViewController("/index","/templates/index.html");
        registry.addRedirectViewController("/","/templates/login.html");
//        registry.addStatusController("/403", HttpStatus.FORBIDDEN);
        super.addViewControllers(registry);
    }
}
