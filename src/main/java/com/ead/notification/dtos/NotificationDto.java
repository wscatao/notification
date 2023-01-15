package com.ead.notification.dtos;

import com.ead.notification.enums.NotificationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class NotificationDto {

    @NotNull
    @JsonProperty(value = "notification_status")
    private NotificationStatus notificationStatus;

    public NotificationStatus getNotificationStatus() {
        return notificationStatus;
    }

    public void setNotificationStatus(NotificationStatus notificationStatus) {
        this.notificationStatus = notificationStatus;
    }
}
