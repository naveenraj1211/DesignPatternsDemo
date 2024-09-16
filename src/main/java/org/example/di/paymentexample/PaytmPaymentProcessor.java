package org.example.di.paymentexample;

public class PaytmPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(String paymentDetails) {
        System.out.println("Processing payment with Paytm: " + paymentDetails);
    }
}
