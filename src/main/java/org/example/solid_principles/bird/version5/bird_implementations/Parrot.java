package org.example.solid_principles.bird.version5.bird_implementations;

import org.example.solid_principles.bird.version5.bird_abstraction.Bird;
import org.example.solid_principles.bird.version5.behaviours_interfaces.Flyable;
import org.example.solid_principles.bird.version5.behaviours_interfaces.FlyingBehaviour;
import org.example.solid_principles.bird.version5.behaviours_interfaces.Singable;

public class Parrot extends Bird implements Flyable, Singable {

    private FlyingBehaviour fb;

    public Parrot(FlyingBehaviour flyingBehaviour) {
        this.fb = flyingBehaviour;
    }

    @Override
    void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    void makeSound() {
        System.out.println("Parrot is making sount");
    }

    @Override
    void sleep() {
        System.out.println("Parrot is sleeping");
    }

    @Override
    public void fly() {
        fb.flying();
        System.out.println("Parrot is flying");
    }

    @Override
    public void sing() {
        System.out.println("Parrot is singing");
    }
}
