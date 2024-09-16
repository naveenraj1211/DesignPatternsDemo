package org.example.di.paymentexample;

public class RideServiceV0 {
    // Direct dependency on PayPal
    private PaytmPaymentProcessorV0 paymentProcessor = new PaytmPaymentProcessorV0();

    public RideServiceV0() {
    }

    public void bookRide(String paymentDetails) {
        paymentProcessor.processPayment(paymentDetails);
        System.out.println("Ride booked!");
    }
}
