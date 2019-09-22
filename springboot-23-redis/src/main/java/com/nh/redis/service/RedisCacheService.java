package com.nh.redis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Set;

/**
 * @Classname RedisCacheService
 * @Description TODO
 * @Date 2019/9/22 7:56 PM
 * @Created by nihui
 */
@Service
public class RedisCacheService {

    @Autowired
    private RedisTemplate redisTemplate;

    //增加缓存
    public boolean set(final String key,Object value){
        boolean result = false;
        try{
            ValueOperations<Serializable,Object> operations = redisTemplate.opsForValue();
            operations.set(key,value);
            result = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    //删除某一类键
    public void removePattern(final String pattern){
        Set<Serializable> keys = redisTemplate.keys(pattern);
        if (keys.size()>0){
            redisTemplate.delete(keys);
        }
    }
}
