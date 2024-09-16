package org.example.di.orderexample;

public class OrderServiceV0 {

    // Direct dependency on EmailNotifier
    private EmailNotifierV0 emailNotifier = new EmailNotifierV0();;

    public OrderServiceV0() {
    }

    public void placeOrder(String emailAddress, String orderDetails) {
        // Process order
        emailNotifier.sendEmail(emailAddress, "Order placed: " + orderDetails);
        System.out.println("Order placed!");
    }
}
