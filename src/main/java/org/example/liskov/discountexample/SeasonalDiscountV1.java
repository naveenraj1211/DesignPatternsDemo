package org.example.liskov.discountexample;

public class SeasonalDiscountV1 implements Discount {

    private double discountPercentage;

    /**
     * Fixing invalid discount:
     * The constructor validates the discount percentage
     * before creating an instance.
     * This prevents the creation of objects in an invalid state.
     * Consistent Behavior:
     * The apply method does not throw exceptions
     * due to invalid state, ensuring that
     * all implementations of Discount behave consistently.
     */

    public SeasonalDiscountV1(double discountPercentage) {

        if (discountPercentage < 0 || discountPercentage > 100)
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100");

        this.discountPercentage = discountPercentage;
    }

    @Override
    public double apply(double amount) {
        return amount - (amount * discountPercentage / 100);
    }
}
