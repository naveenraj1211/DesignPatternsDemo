package org.example.factory.notificationsystemexample;

public class NotificationFactory {

    public static Notification createNotification(NotificationType notificationType, String recipient, String sender, String message)
    {
        return switch (notificationType){
            case EMAIL -> new EmailNotification(recipient, sender, message);
            case SMS -> new SmsNotification(recipient, message);
            case PUSH -> new PushNotification(recipient, message);
        };

    }
}