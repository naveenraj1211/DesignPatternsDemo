package org.example.ocp.notifyexample;

public class NotificationServiceV1 {

    /**
     * New notification types can be added easily
     * by adding a class implementing the Notification interface .
     * The NotificationService class does not need modification
     * to support new types/ new features
     */

    private Notification notification;

    NotificationServiceV1(Notification notification) {
        this.notification = notification;
    }

    public void send(String message) {
        notification.send(message);
    }
}
