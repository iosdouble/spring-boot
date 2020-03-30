package com.nh.workflow.workflowsupport.dao.bean;

public class EventService {
    private Integer eventId;

    private String eventCode;

    private String eventDescribe;

    private Integer eventLevel;

    public EventService(Integer eventId, String eventCode, String eventDescribe, Integer eventLevel) {
        this.eventId = eventId;
        this.eventCode = eventCode;
        this.eventDescribe = eventDescribe;
        this.eventLevel = eventLevel;
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

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode == null ? null : eventCode.trim();
    }

    public String getEventDescribe() {
        return eventDescribe;
    }

    public void setEventDescribe(String eventDescribe) {
        this.eventDescribe = eventDescribe == null ? null : eventDescribe.trim();
    }

    public Integer getEventLevel() {
        return eventLevel;
    }

    public void setEventLevel(Integer eventLevel) {
        this.eventLevel = eventLevel;
    }
}