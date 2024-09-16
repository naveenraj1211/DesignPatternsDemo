package org.example.liskov.shapeexample;

public class SquareV0 extends RectangleV0{

    /**
     * The Square class extends Rectangle,
     * but it modifies the behavior of setWidth and setHeight methods,
     * which violates the contract expected by Rectangle.
     * For example, setting the width of a
     * Square also changes its height,
     * which is not true for a Rectangle.
     *
     */
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        // hacky way
        super.setWidth(height); // This breaks the Rectangle contract
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // This breaks the Rectangle contract
    }
}
