package com.nh.workflow.workflowsupport.dao.mapper;

import com.nh.workflow.workflowsupport.dao.bean.TaskFlowEventRelation;
import com.nh.workflow.workflowsupport.dao.bean.TaskFlowEventRelationExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
@Mapper
public interface TaskFlowEventRelationMapper extends Serializable {
    long countByExample(TaskFlowEventRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TaskFlowEventRelation record);

    int insertSelective(TaskFlowEventRelation record);

    List<TaskFlowEventRelation> selectByExample(TaskFlowEventRelationExample example);

    TaskFlowEventRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TaskFlowEventRelation record, @Param("example") TaskFlowEventRelationExample example);

    int updateByExample(@Param("record") TaskFlowEventRelation record, @Param("example") TaskFlowEventRelationExample example);

    int updateByPrimaryKeySelective(TaskFlowEventRelation record);

    int updateByPrimaryKey(TaskFlowEventRelation record);
}