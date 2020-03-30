package com.nh.workflow.workflowsupport.dao.mapper;

import com.nh.workflow.workflowsupport.dao.bean.EventService;
import com.nh.workflow.workflowsupport.dao.bean.EventServiceExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
@Mapper
public interface EventServiceMapper extends Serializable {
    long countByExample(EventServiceExample example);

    int deleteByPrimaryKey(Integer eventId);

    int insert(EventService record);

    int insertSelective(EventService record);

    List<EventService> selectByExample(EventServiceExample example);

    EventService selectByPrimaryKey(Integer eventId);

    int updateByExampleSelective(@Param("record") EventService record, @Param("example") EventServiceExample example);

    int updateByExample(@Param("record") EventService record, @Param("example") EventServiceExample example);

    int updateByPrimaryKeySelective(EventService record);

    int updateByPrimaryKey(EventService record);
}