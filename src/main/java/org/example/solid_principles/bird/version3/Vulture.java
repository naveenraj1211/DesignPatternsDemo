package org.example.solid_principles.bird.version3;

public class Vulture extends Bird implements Flyable{

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
