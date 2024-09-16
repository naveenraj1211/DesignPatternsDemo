package org.example.di.paymentexample;

public class Client {

    public static void main(String[] args) {
        PaymentProcessor paypal = new PaytmPaymentProcessor();
        RideServiceV1 rideService = new RideServiceV1(paypal);
        rideService.bookRide("Payment details for Paytm");

        PaymentProcessor stripe = new GpayPaymentProcessor();
        RideServiceV1 rideServiceWithStripe = new RideServiceV1(stripe);
        rideServiceWithStripe.bookRide("Payment details for Gpay");
    }
}
