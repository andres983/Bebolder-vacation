package com.beboldervacation.domain;

import java.util.List;

public class Notification {
    private Integer id;
    private String recipients;
    private String affair;
    private String message;
    private Integer notificationTypeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    public String getAffair() {
        return affair;
    }

    public void setAffair(String affair) {
        this.affair = affair;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getNotificationTypeId() {
        return notificationTypeId;
    }

    public void setNotificationTypeId(Integer notificationTypeId) {
        this.notificationTypeId = notificationTypeId;
    }
}
