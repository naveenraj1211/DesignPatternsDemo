package org.example.solid_principles.bird.version5.bird_abstraction;

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
