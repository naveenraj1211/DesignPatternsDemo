package org.example.solid_principles.bird.version2;

public class Parrot extends FlyingSingingNonSwimmingBird{

    @Override
    void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    void sing() {
        System.out.println("Parrot is singing");
    }
}
