package org.example.solid_principles.bird.version5.bird_implementations;

import org.example.solid_principles.bird.version5.bird_abstraction.Bird;
import org.example.solid_principles.bird.version5.behaviours_interfaces.Flyable;
import org.example.solid_principles.bird.version5.behaviours_interfaces.FlyingBehaviour;

public class Eagle extends Bird implements Flyable {

   private FlyingBehaviour fb;

    public Eagle(FlyingBehaviour flyingBehaviour)
    {
        this.fb = flyingBehaviour;
    }

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
        fb.flying();
        System.out.println("Eagle is flying");
    }
}
