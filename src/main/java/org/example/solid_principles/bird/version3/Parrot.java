package org.example.solid_principles.bird.version3;

public class Parrot extends Bird implements Flyable, Singable {

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
        System.out.println("Parrot is flying");
    }

    @Override
    public void sing() {
        System.out.println("Parrot is singing");
    }
}
