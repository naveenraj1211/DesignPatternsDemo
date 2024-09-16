package org.example.ocp.paymentexample;

import org.example.srp.orderexample.PaymentProcessor;

public class PaymentProcessorV1 {

    /**
     * How to fix OCP violation:
     * New payment methods can be added by
     * creating a new class and implementing the PaymentMethod interface.
     * The PaymentProcessor class remains unchanged,
     * thus adhering to OCP.
     */

    private PaymentMethod paymentMethod;

    //set payment method during class creation or using setter
    public PaymentProcessorV1(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void process(double amount) {
        paymentMethod.process(amount);
    }
}
