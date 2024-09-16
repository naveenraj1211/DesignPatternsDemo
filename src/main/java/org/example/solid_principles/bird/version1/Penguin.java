package org.example.solid_principles.bird.version1;

public class Penguin extends Bird {
    @Override
    void eat() {
        System.out.println("Penguin is easting");
    }

    /**
     * penguin cannot fly.
     * What to do when client call this method
     * 1. Leave it empty
     * 2. throw exception
     * 3. print cannot fly
     * 4. give some default implementation in base class
     * ---------
     * Liskov substitution principle violated:
     * Ideally, If a child class does not support a method,
     * it not have that method
     *
     */
    @Override
    void fly() {
        System.out.println("Penguin cannot fly");
    }

    @Override
    void makeSound() {
        System.out.println("Penguin is making sound");
    }
}
