package org.example.ocp.paymentexample;

public class PaymentProcessorV0 {

    /**
     * Open/Closed Principle
     * The processPayment method handles different payment methods
     * through conditional logic. (multiple is else)
     * Adding a new payment method necessitates changing this method, violating OCP.
     */

    public void processPayment(String paymentMethod, double amount) {
        if (paymentMethod.equals("creditCard")) {
            // Process credit card payment
            System.out.println(amount + "is deducted from creditCard");
        } else if (paymentMethod.equals("debitCard")) {
            // Process PayPal payment
            System.out.println(amount + "is deducted from debitCard");
        } else if (paymentMethod.equals("paypal")) {
            // Process PayPal payment
            System.out.println(amount + "is deducted from paypal account");
        } else if (paymentMethod.equals("upi")) {
            // Process PayPal payment
            System.out.println(amount + "is deducted from upi account");
        }
    }
}
