package org.example.srp.orderexample;

public class OrderV0 {

    /**
     * Here, the Order class is responsible for
     * both processing payments and
     * printing receipts, which violates SRP.
     */

    private double amount;

    public OrderV0(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void processOrder() {
        // Process payment
        System.out.println("Processing payment of " + amount);

        // Print receipt
        System.out.println("Printing receipt for " + amount);
    }
}
