package org.example.solid_principles.bird.version4;

import org.example.solid_principles.bird.version4.Bird;
import org.example.solid_principles.bird.version4.Flyable;

public class Eagle extends Bird implements Flyable {

    FlyHigh flyHigh = new FlyHigh();

    @Override
    void eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    void makeSound() {
        System.out.println("Eagle is making sound");
    }

    @Override
    void sleep() {
        System.out.println("Eagle is sleeping");
    }

    @Override
    public void fly() {
        flyHigh.highFlying();
        System.out.println("Eagle is flying");
    }
}
