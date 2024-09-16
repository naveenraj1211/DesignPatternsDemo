package org.example.solid_principles.bird.version2;

public class Penguin extends NonFlyingBird{
    @Override
    void eat() {
        System.out.println("Penguin is eating");
    }

    @Override
    void makeSound() {
        System.out.println("Penguin is making sound");
    }
}
