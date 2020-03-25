package com.nihui.restlog.util;

/**
 * @Classname ThreadLocalUtil
 * @Description TODO
 * @Date 2020/3/25 1:16 PM
 * @Created by nihui
 */
public class ThreadLocalUtil {

    private ThreadLocalUtil(){}

    private static ThreadLocal<Object> t = new ThreadLocal<Object>();

    public static ThreadLocal<Object> getInstance() {
        return t;
    }
}
