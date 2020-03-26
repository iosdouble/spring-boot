package com.nh.workflow.workflowsupport.dao.bean;

public class EventService {
    private Integer eventId;

    private String eventDescribe;

    private Integer eventNumber;

    public EventService(Integer eventId, String eventDescribe, Integer eventNumber) {
        this.eventId = eventId;
        this.eventDescribe = eventDescribe;
        this.eventNumber = eventNumber;
    }

    public EventService() {
        super();
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getEventDescribe() {
        return eventDescribe;
    }

    public void setEventDescribe(String eventDescribe) {
        this.eventDescribe = eventDescribe == null ? null : eventDescribe.trim();
    }

    public Integer getEventNumber() {
        return eventNumber;
    }

    public void setEventNumber(Integer eventNumber) {
        this.eventNumber = eventNumber;
    }
}