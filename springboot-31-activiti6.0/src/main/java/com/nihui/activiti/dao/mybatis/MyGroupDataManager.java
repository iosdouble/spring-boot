package com.nihui.activiti.dao.mybatis;

import org.activiti.engine.identity.Group;
import org.activiti.engine.impl.GroupQueryImpl;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.persistence.entity.GroupEntity;
import org.activiti.engine.impl.persistence.entity.GroupEntityImpl;
import org.activiti.engine.impl.persistence.entity.data.impl.MybatisGroupDataManager;

import java.util.List;
import java.util.Map;

/**
 * @Classname MyGroupDataManager
 * @Description TODO 自定义封装数据库
 * @Date 2020/3/26 2:16 PM
 * @Created by nihui
 */
public class MyGroupDataManager extends MybatisGroupDataManager {
    public MyGroupDataManager(ProcessEngineConfigurationImpl processEngineConfiguration) {
        super(processEngineConfiguration);
    }

    @Override
    public Class<? extends GroupEntity> getManagedEntityClass() {
        return GroupEntityImpl.class;
    }

    @Override
    public GroupEntity create() {
        return new GroupEntityImpl();
    }

    @SuppressWarnings("unchecked")
    public List<Group> findGroupByQueryCriteria(GroupQueryImpl query, Page page) {
        return getDbSqlSession().selectList("selectGroupByQueryCriteria", query, page);
    }

    public long findGroupCountByQueryCriteria(GroupQueryImpl query) {
        return (Long) getDbSqlSession().selectOne("selectGroupCountByQueryCriteria", query);
    }

    @SuppressWarnings("unchecked")
    public List<Group> findGroupsByUser(String userId) {
        return getDbSqlSession().selectList("selectGroupsByUserId", userId);
    }

    @SuppressWarnings("unchecked")
    public List<Group> findGroupsByNativeQuery(Map<String, Object> parameterMap, int firstResult, int maxResults) {
        return getDbSqlSession().selectListWithRawParameter("selectGroupByNativeQuery", parameterMap, firstResult, maxResults);
    }

    public long findGroupCountByNativeQuery(Map<String, Object> parameterMap) {
        return (Long) getDbSqlSession().selectOne("selectGroupCountByNativeQuery", parameterMap);
    }
}
