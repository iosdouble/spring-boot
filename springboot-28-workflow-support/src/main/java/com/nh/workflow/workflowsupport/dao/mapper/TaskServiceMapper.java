package com.nh.workflow.workflowsupport.dao.mapper;

import com.nh.workflow.workflowsupport.dao.bean.TaskService;
import com.nh.workflow.workflowsupport.dao.bean.TaskServiceExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
@Mapper
public interface TaskServiceMapper extends Serializable {
    long countByExample(TaskServiceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TaskService record);

    int insertSelective(TaskService record);

    List<TaskService> selectByExampleWithBLOBs(TaskServiceExample example);

    List<TaskService> selectByExample(TaskServiceExample example);

    TaskService selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TaskService record, @Param("example") TaskServiceExample example);

    int updateByExampleWithBLOBs(@Param("record") TaskService record, @Param("example") TaskServiceExample example);

    int updateByExample(@Param("record") TaskService record, @Param("example") TaskServiceExample example);

    int updateByPrimaryKeySelective(TaskService record);

    int updateByPrimaryKeyWithBLOBs(TaskService record);

    int updateByPrimaryKey(TaskService record);
}