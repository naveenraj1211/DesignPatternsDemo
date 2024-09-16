package org.example.di.orderexample;

public class EmailNotifierV1 implements Notifier{

    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}
