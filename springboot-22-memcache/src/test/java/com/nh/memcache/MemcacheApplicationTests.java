package com.nh.memcache;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeoutException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemcacheApplicationTests {

    @Autowired
    private MemcachedClient memcachedClient;
    @Test
    public void contextLoads() throws Exception {
        memcachedClient.set("hello",0,"Hello,xmemcached");
        String value = memcachedClient.get("hello");
        System.out.println("hello = "+ value);
        memcachedClient.delete("hello");
    }

}
