package org.example.di.orderexample;

public class OrderServiceV1 {

    private Notifier notifier;

    public OrderServiceV1(Notifier notifier) {
        this.notifier = notifier;
    }

    public void placeOrder(String recipient, String orderDetails) {
        // Process order
        notifier.sendNotification(recipient, "Order placed: " + orderDetails);
        System.out.println("Order placed!");
    }
}
