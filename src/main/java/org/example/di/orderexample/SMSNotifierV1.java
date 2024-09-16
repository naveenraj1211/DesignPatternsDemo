package org.example.di.orderexample;

public class SMSNotifierV1 implements Notifier {
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}
