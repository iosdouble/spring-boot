package com.nihui.activiti.config;

import com.nihui.activiti.interceptor.MyCommandInterceptor;
import org.activiti.engine.*;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.interceptor.CommandInterceptor;
import org.activiti.engine.impl.persistence.entity.data.UserDataManager;

/**
 * @Classname MyProcessEngineConfiguration
 * @Description TODO
 * @Date 2020/3/26 3:58 PM
 * @Created by nihui
 */
public class MyProcessEngineConfiguration extends ProcessEngineConfigurationImpl {

    protected UserDataManager userDataManager;



    @Override
    public CommandInterceptor createTransactionInterceptor() {
        return new MyCommandInterceptor();
    }

}
