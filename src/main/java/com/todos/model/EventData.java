package com.todos.model;


public class EventData {
    private String eventId;
    private String userId;
    private String timestamp;
    private String browser;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    @Override
    public String toString() {
        return "{" +
                "eventId='" + eventId + '\'' +
                ", userId='" + userId + '\'' +
                ", timestamp=" + timestamp +
                ", browser='" + browser + '\'' +
                '}';
    }

}
