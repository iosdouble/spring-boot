package com.nh.redis;

import com.nh.redis.bean.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void contextLoads() {
        redisTemplate.opsForValue().set("nihui","hello");
        Assert.assertEquals("hello",redisTemplate.opsForValue().get("nihui"));
    }


    @Test
    public void testObj(){
        User user = new User("nihui",23,"123@163.com");
        ValueOperations<String,User> operations = redisTemplate.opsForValue();
        operations.set("user",user);
        User u = operations.get("user");
        System.out.println("user : "+ u.toString());
    }

    @Test
    public void testExpire() throws InterruptedException {
        User user = new User("nihui",23,"123@163.com");
        ValueOperations<String,User> operations = redisTemplate.opsForValue();
        operations.set("nihui",user,100,TimeUnit.MILLISECONDS);
        Thread.sleep(1000);
        boolean exists = redisTemplate.hasKey("nihui");
        if (exists){
            System.out.println("exists is true");
        }else {
            System.out.println("exists is false");
        }
    }


    @Test
    public void testDelete(){
        redisTemplate.opsForValue().set("deleteKey","hello,nihui");
        redisTemplate.delete("deleteKey");
        boolean exists = redisTemplate.hasKey("deleteKey");
        if (exists){
            System.out.println("exists is true");
        }else {
            System.out.println("exists is false");
        }
    }

    @Test
    public void testHash(){
        HashOperations<String,Object,Object> hashOperations = redisTemplate.opsForHash();
        hashOperations.put("nihui","hello","hello");
        String value = (String) hashOperations.get("nihui","hello");
        System.out.println("hash value "+value);
    }

    @Test
    public void testList(){
        ListOperations<String,String> listOperations = redisTemplate.opsForList();
        listOperations.leftPush("list","nihui");
        listOperations.leftPush("list","hello");
        listOperations.leftPush("list","know");

        String value = listOperations.leftPop("list");
        System.out.println("list value : "+value.toString());
    }


    @Test
    public void testSet(){
        String key = "set";
        SetOperations<String,String> setOperations = redisTemplate.opsForSet();
        setOperations.add(key,"nihui");
        setOperations.add(key,"nihui");
        setOperations.add(key,"hello");
        setOperations.add(key,"world");

        Set<String> values = setOperations.members(key);

        for (String v:values) {
            System.out.println("set value : "+v);
        }
    }

    @Test
    public void testSetDifference(){
        SetOperations<String,String> setOperations = redisTemplate.opsForSet();
        String key1 = "key1";
        String key2 = "key2";

        setOperations.add(key1,"nihui");
        setOperations.add(key1,"hello");
        setOperations.add(key1,"hello");
        setOperations.add(key1,"world");
        setOperations.add(key2,"xxx");
        setOperations.add(key2,"nihui");

        Set<String> diffs = setOperations.difference(key1,key2);
        for (String v :diffs){
            System.out.println("diffs set value :"+v);
        }

    }

    @Test
    public void testSetUnions(){
        SetOperations<String,String> setOperations = redisTemplate.opsForSet();
        String key1 = "key1";
        String key2 = "key2";

        setOperations.add(key1,"nihui");
        setOperations.add(key1,"hello");
        setOperations.add(key1,"xxx");
        setOperations.add(key2,"aa");
        setOperations.add(key2,"bb");
        setOperations.add(key2,"world");

        Set<String> unions = setOperations.union(key1,key2);
        for (String v :unions){
            System.out.println("unions set value :"+v);
        }

    }


    @Test
    public void testZset(){
        String key = "zset";
        redisTemplate.delete(key);
        ZSetOperations<String,String> zSetOperations = redisTemplate.opsForZSet();
        zSetOperations.add(key,"nihui",1);
        zSetOperations.add(key,"hello",6);
        zSetOperations.add(key,"world",4);
        zSetOperations.add(key,"test",3);


        Set<String> zsets = zSetOperations.range(key,0,3);
        for (String value:zsets) {
            System.out.println("zset value : "+value);
        }

        Set<String> zsett = zSetOperations.rangeByScore(key,0,3);
        for (String value:zsett) {
            System.out.println("zsett value : "+value);
        }
    }

}
