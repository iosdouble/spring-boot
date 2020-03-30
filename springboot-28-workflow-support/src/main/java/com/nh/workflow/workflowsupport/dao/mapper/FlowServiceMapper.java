package com.nh.workflow.workflowsupport.dao.mapper;

import com.nh.workflow.workflowsupport.dao.bean.FlowService;
import com.nh.workflow.workflowsupport.dao.bean.FlowServiceExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

@Mapper
public interface FlowServiceMapper extends Serializable {
    long countByExample(FlowServiceExample example);

    int deleteByPrimaryKey(Integer flowId);

    int insert(FlowService record);

    int insertSelective(FlowService record);

    List<FlowService> selectByExample(FlowServiceExample example);

    FlowService selectByPrimaryKey(Integer flowId);

    int updateByExampleSelective(@Param("record") FlowService record, @Param("example") FlowServiceExample example);

    int updateByExample(@Param("record") FlowService record, @Param("example") FlowServiceExample example);

    int updateByPrimaryKeySelective(FlowService record);

    int updateByPrimaryKey(FlowService record);
}