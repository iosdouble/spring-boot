package com.nh.springmvc.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.*;
import java.util.List;

/**
 * @Classname MyWebMvcConfig
 * @Description TODO
 * @Date 2019/9/6 3:17 PM
 * @Created by nihui
 */
public class MyWebMvcConfig extends WebMvcConfigurationSupport {

    //TODO 静态资源的配置
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        //将所有来自/app/以及/bower_components的请求都映射到类路径下的static中
        registry.addResourceHandler("/app/**").addResourceLocations("classpath:/static/app");
        registry.addResourceHandler("/bower_components/**").addResourceLocations("classpath:/static/bower_components");

    }

    //TODO 拦截器配置
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        MyHandlerInterceptor myHandlerInterceptor = new MyHandlerInterceptor();
        registry.addInterceptor(myHandlerInterceptor).addPathPatterns("*/**")
                .excludePathPatterns("/index","/login");
    }

    //TODO 跨域配置
    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        super.addCorsMappings(registry);
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("PUT,GET,POST,DELETE,OPTIONS")
                .allowedHeaders("*");
    }

    //TODO 视图控制器
    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry);
        registry.addViewController("/").setViewName("/index");
        registry.addViewController("/index").setViewName("/index");
        registry.addViewController("/about").setViewName("/about");
        registry.addViewController("/error/403").setViewName("/error/403");
        registry.addViewController("/error/500").setViewName("/error/500");

    }

    //TODO 消息转换配置
    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        //创建一个消息转换器使用FastJson
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();

        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        //规则赋予转换对象
        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);


        // 中文乱码解决方案
        //List<MediaType> mediaTypes = new ArrayList<>();
       // mediaTypes.add(MediaType.APPLICATION_JSON_UTF8);//设定json格式且编码为UTF-8
       // fastJsonHttpMessageConverter.setSupportedMediaTypes(mediaTypes);

        converters.add(fastJsonHttpMessageConverter);
    }

    //TODO 数据格式化器配置
    @Override
    protected void addFormatters(FormatterRegistry registry) {
        super.addFormatters(registry);
        registry.addFormatter(new DateFormatter("yyyy-MM-dd"));
    }

    //TODO 视图解析器配置
    @Override
    protected void configureViewResolvers(ViewResolverRegistry registry) {
        super.configureViewResolvers(registry);
        MyViewResolver myViewResolver = new MyViewResolver();
        registry.viewResolver(myViewResolver);
    }

}
