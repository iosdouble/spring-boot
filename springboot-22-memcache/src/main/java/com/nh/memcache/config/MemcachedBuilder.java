package com.nh.memcache.config;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.utils.AddrUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.io.IOException;


/**
 * @Classname MemcachedBuilder
 * @Description TODO
 * @Date 2019/9/21 12:44 PM
 * @Created by nihui
 */
@Configuration
public class MemcachedBuilder  {
    protected static Logger logger = LoggerFactory.getLogger(MemcachedBuilder.class);

    @Resource
    private XMemcachedProperties xMemcachedProperties;

    @Bean
    public MemcachedClient getMemcachedClinet(){
        MemcachedClient memcachedClient = null;
        try {
            MemcachedClientBuilder builder = new XMemcachedClientBuilder(AddrUtil.getAddresses(xMemcachedProperties.getServers()));
            builder.setConnectionPoolSize(xMemcachedProperties.getPoolSize());
            builder.setOpTimeout(xMemcachedProperties.getOpTimeout());
            memcachedClient = builder.build();
        }catch (IOException e){
            logger.error("init MemcachedClient failed"+e);
        }
        return memcachedClient;
    }
}
