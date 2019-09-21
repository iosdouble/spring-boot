package com.nh.memcache.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Classname XMemcachedProperties
 * @Description TODO
 * @Date 2019/9/21 12:41 PM
 * @Created by nihui
 */
@Component
@ConfigurationProperties(prefix = "memcached")
public class XMemcachedProperties {
    private String servers;
    private int poolSize;
    private long opTimeout;

    public String getServers() {
        return servers;
    }

    public void setServers(String servers) {
        this.servers = servers;
    }

    public int getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(int poolSize) {
        this.poolSize = poolSize;
    }

    public long getOpTimeout() {
        return opTimeout;
    }

    public void setOpTimeout(long opTimeout) {
        this.opTimeout = opTimeout;
    }
}
