package com.nh.workflow.workflowsupport.dao.mapper;

import com.nh.workflow.workflowsupport.bean.ExtFlowToEvent;
import com.nh.workflow.workflowsupport.dao.bean.FlowToEventRelation;
import com.nh.workflow.workflowsupport.dao.bean.FlowToEventRelationExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
@Mapper
public interface FlowToEventRelationMapper extends Serializable {
    long countByExample(FlowToEventRelationExample example);

    int deleteByPrimaryKey(Integer realId);

    int insert(FlowToEventRelation record);

    int insertSelective(FlowToEventRelation record);

    List<FlowToEventRelation> selectByExample(FlowToEventRelationExample example);

    FlowToEventRelation selectByPrimaryKey(Integer realId);

    int updateByExampleSelective(@Param("record") FlowToEventRelation record, @Param("example") FlowToEventRelationExample example);

    int updateByExample(@Param("record") FlowToEventRelation record, @Param("example") FlowToEventRelationExample example);

    int updateByPrimaryKeySelective(FlowToEventRelation record);

    int updateByPrimaryKey(FlowToEventRelation record);

    List<ExtFlowToEvent> flowToEventDetail(Integer flowId);
}