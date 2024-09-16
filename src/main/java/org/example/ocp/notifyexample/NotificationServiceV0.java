package org.example.ocp.notifyexample;

public class NotificationServiceV0 {

    /**
     * The sendNotification method relies on conditional logic
     * to handle different types of notifications.
     * Adding a new notification type would require
     * modifying this method, violating OCP.
     */

    public void sendNotification(String type, String message) {

        if (type.equals("email")) {
            // Code to send email
        } else if (type.equals("discord")) {
            // Code to send discord
        } else if (type.equals("slack")) {
            // Code to send slack
        } else if (type.equals("whatsapp")) {
            // Code to send whatsapp
        } else {
            // Code to send SMS
        }
    }
}
