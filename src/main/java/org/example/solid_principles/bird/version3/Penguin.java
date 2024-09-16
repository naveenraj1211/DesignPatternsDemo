package org.example.solid_principles.bird.version3;

public class Penguin extends Bird implements Swimmable {
    @Override
    void eat() {
        System.out.println("Penguin is eating");
    }

    @Override
    void makeSound() {
        System.out.println("Penguin is making sound");
    }

    @Override
    void sleep() {
        System.out.println("Penguin is sleeping");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
