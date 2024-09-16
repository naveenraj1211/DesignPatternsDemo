package org.example.srp.orderexample;

public class OrderV1 {

    /**
     * To fix srp violation:
     * the Order class only holds the order amount,
     * PaymentProcessor handles payment processing,
     * and ReceiptPrinter deals with printing receipts.
     * Each class has a single responsibility.
     */
    private double amount;

    public OrderV1(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
