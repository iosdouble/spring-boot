package com.nihui.restlog.log.eventlog.aop;

import java.lang.annotation.*;

/**
 * @Classname IgnoreRestLog
 * @Description TODO
 * @Date 2020/3/25 11:43 AM
 * @Created by nihui
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE,ElementType.METHOD})
@Documented
public @interface IgnoreRestLog {
}
