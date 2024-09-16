package org.example.solid_principles.bird.version4;

import org.example.solid_principles.bird.version4.Bird;
import org.example.solid_principles.bird.version4.Flyable;

public class Sparrow extends Bird implements Flyable {

    FlyLow flyLow = new FlyLow();

    @Override
    void eat() {
        System.out.println("Sparrow is eating");
    }

    @Override
    void makeSound() {
        System.out.println("Sparrow is making sound");
    }

    @Override
    void sleep() {
        System.out.println("Sparrow is sleeping");
    }

    @Override
    public void fly() {
        flyLow.flyingLow();
        System.out.println("Sparrow is flying");
    }
}
