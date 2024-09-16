package org.example.solid_principles.bird.version3;

public class Eagle extends Bird implements Flyable{
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
        System.out.println("Eagle is flying");
    }
}
