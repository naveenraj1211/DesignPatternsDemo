package org.example.solid_principles.bird.version3;

public class Sparrow extends Bird implements Flyable{

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
        System.out.println("Sparrow is flying");
    }
}
