package org.example.srp.orderexample;

public class PaymentProcessor {

    public void processPayment(OrderV1 order) {
        // Process payment
        System.out.println("Processing payment of " + order.getAmount());
    }
}
