package org.example.liskov.discountexample;

public class SeasonalDiscountV0 implements Discount{

    private final double discountPercentage;

    public SeasonalDiscountV0(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    /**
     * apply method might throw exceptions
     * if the discount percentage is out of a valid range,
     * which isn't handled gracefully and
     * can break substitutability
     * if this behavior is unexpected.
     */
    @Override
    public double apply(double amount) {
        if(discountPercentage < 0 || discountPercentage >100)
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100");

        return amount - (amount - discountPercentage/100);
    }

}
