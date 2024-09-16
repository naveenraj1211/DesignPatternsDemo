package org.example.ocp.paymentexample;

public class CreditCardPayment implements PaymentMethod {


    @Override
    public void process(double amount) {
        // Process credit card payment
        System.out.println(amount + "is deducted from creditCard");
    }
}
