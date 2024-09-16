package org.example.di.paymentexample;

public class GpayPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(String paymentDetails) {
        System.out.println("Processing payment with Stripe: " + paymentDetails);
    }
}
