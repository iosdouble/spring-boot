package com.nihui.activiti.interceptor;

import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.impl.interceptor.CommandConfig;
import org.activiti.engine.impl.interceptor.CommandInterceptor;

/**
 * @Classname MyCommandInterceptor
 * @Description TODO
 * @Date 2020/3/26 4:22 PM
 * @Created by nihui
 */
public class MyCommandInterceptor implements CommandInterceptor {
    @Override
    public <T> T execute(CommandConfig config, Command<T> command) {
        return null;
    }

    @Override
    public CommandInterceptor getNext() {
        return null;
    }

    @Override
    public void setNext(CommandInterceptor next) {

    }
}
