package org.example.solid_principles.bird.version1;

public class Eagle extends Bird{
    @Override
    void eat() {
        System.out.println("Eagle is easting");
    }

    @Override
    void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    void makeSound() {
        System.out.println("Eagle is making sound");
    }
}
