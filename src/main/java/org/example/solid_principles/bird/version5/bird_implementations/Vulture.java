package org.example.solid_principles.bird.version5.bird_implementations;

import org.example.solid_principles.bird.version5.bird_abstraction.Bird;
import org.example.solid_principles.bird.version5.behaviours_interfaces.Flyable;
import org.example.solid_principles.bird.version5.behaviours_interfaces.FlyingBehaviour;

public class Vulture extends Bird implements Flyable {
    private FlyingBehaviour fb;

    public Vulture(FlyingBehaviour flyingBehaviour) {
        this.fb = flyingBehaviour;
    }

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
        fb.flying();
        System.out.println("Vulture is flying");
    }
}
