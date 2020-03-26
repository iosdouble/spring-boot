package com.nh.workflow.workflowsupport.dao.mapper;

import com.nh.workflow.workflowsupport.dao.bean.EventService;
import com.nh.workflow.workflowsupport.dao.bean.EventServiceExample;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

public interface EventServiceMapper extends Serializable {
    long countByExample(EventServiceExample example);

    int insert(EventService record);

    int insertSelective(EventService record);

    List<EventService> selectByExample(EventServiceExample example);

    int updateByExampleSelective(@Param("record") EventService record, @Param("example") EventServiceExample example);

    int updateByExample(@Param("record") EventService record, @Param("example") EventServiceExample example);
}