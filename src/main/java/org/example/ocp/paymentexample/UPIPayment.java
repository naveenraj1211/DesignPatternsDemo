package org.example.ocp.paymentexample;

public class UPIPayment implements PaymentMethod {

    @Override
    public void process(double amount) {
        //Process UPI payment
        System.out.println(amount + " is deducted from UPI account");
    }
}
