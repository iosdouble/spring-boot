package com.nh.workflow.workflowsupport.service;

import com.nh.workflow.workflowsupport.dao.bean.EventService;

/**
 * @Classname EventOptationService
 * @Description TODO
 * @Date 2020/3/27 11:34 AM
 * @Created by nihui
 */
public interface EventOperationService {
    public String addEvent(EventService eventService);

    public EventService getEventById(Integer eventId);
}
