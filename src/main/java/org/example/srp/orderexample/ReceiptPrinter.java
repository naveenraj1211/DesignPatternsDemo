package org.example.srp.orderexample;

public class ReceiptPrinter {

    public void printReceipt(OrderV1 order) {
        // Print receipt
        System.out.println("Printing receipt for " + order.getAmount());
    }
}
