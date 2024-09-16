package org.example.solid_principles.bird.version4;

import org.example.solid_principles.bird.version4.Bird;
import org.example.solid_principles.bird.version4.Flyable;

public class Vulture extends Bird implements Flyable {

    @Override
    void eat() {
        System.out.println("Vulture is eating");
    }

    @Override
    void makeSound() {
        System.out.println("Vulture is making sound");
    }

    @Override
    void sleep() {
        System.out.println("Vulture is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Vulture is flying");
    }
}
