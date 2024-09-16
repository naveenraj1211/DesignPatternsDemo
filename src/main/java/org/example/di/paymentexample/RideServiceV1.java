package org.example.di.paymentexample;

public class RideServiceV1 {

    private PaymentProcessor paymentProcessor;

    public RideServiceV1(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void bookRide(String paymentDetails) {
        paymentProcessor.processPayment(paymentDetails);
        System.out.println("Ride booked!");
    }
}
