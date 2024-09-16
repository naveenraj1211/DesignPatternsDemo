package org.example.liskov.shapeexample;

public class SquareV1 implements Shape{

    private int size;

    @Override
    public int getWidth() {
        return size;
    }

    @Override
    public int getHeight() {
        return size;
    }

    @Override
    public void setWidth(int width) {
        this.size = width;
    }

    @Override
    public void setHeight(int height) {
        this.size = height;
    }
}
