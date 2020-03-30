package com.nh.workflow.workflowsupport.service.impl;

import com.nh.workflow.workflowsupport.dao.bean.EventService;
import com.nh.workflow.workflowsupport.dao.mapper.EventServiceMapper;
import com.nh.workflow.workflowsupport.service.EventOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname EventOperationServiceImpl
 * @Description TODO
 * @Date 2020/3/27 11:36 AM
 * @Created by nihui
 */
@Service
public class EventOperationServiceImpl implements EventOperationService {

    @Autowired
    private EventServiceMapper eventServiceMapper;

    @Override
    public String addEvent(EventService eventService) {
        String status = "false";
        int insert = eventServiceMapper.insert(eventService);
        if (insert != 0){
            status = "true";
        }
        return status;
    }

    @Override
    public EventService getEventById(Integer eventId) {
        return eventServiceMapper.selectByPrimaryKey(eventId);
    }
}
