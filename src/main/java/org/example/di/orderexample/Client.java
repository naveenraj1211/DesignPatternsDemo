package org.example.di.orderexample;

public class Client {

    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifierV1();
        OrderServiceV1 orderService = new OrderServiceV1(emailNotifier);
        orderService.placeOrder("user@example.com", "Pizza");

        Notifier smsNotifier = new SMSNotifierV1();
        OrderServiceV1 orderServiceWithSMS = new OrderServiceV1(smsNotifier);
        orderServiceWithSMS.placeOrder("123-456-7890", "Burger");
    }
}
