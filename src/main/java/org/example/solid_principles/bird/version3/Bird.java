package org.example.solid_principles.bird.version3;

public abstract class Bird {

    String name;
    String gender;
    String weight;
    String color;
    String type;

    abstract void eat();
    abstract void makeSound();
    abstract void sleep();
}
