package com.nihui.activiti.dao.mybatis;

import com.nihui.activiti.bean.ExtUser;
import org.activiti.engine.identity.Group;
import org.activiti.engine.identity.User;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.UserQueryImpl;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.persistence.entity.UserEntity;
import org.activiti.engine.impl.persistence.entity.UserEntityImpl;
import org.activiti.engine.impl.persistence.entity.data.UserDataManager;
import org.activiti.engine.impl.persistence.entity.data.impl.MybatisUserDataManager;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Classname MyUserDataManager
 * @Description TODO
 * @Date 2020/3/26 2:26 PM
 * @Created by nihui
 */
@Mapper
public interface MyUserDataManagerMapper {
    ExtUser findById(String entityId);
}
