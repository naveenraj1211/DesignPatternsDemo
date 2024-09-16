package org.example.solid_principles.bird.version0;

public class Bird {

    String name;
    String gender;
    String color;
    String type;

    public void eat() {
        if (type.equals("peacock")) {
            System.out.println("Peacock is eating");
        } else if (type.equals("eagle")) {
            System.out.println("eagle is eating");
        } else if (type.equals("crow")) {
            System.out.println("crow is eating");
        } else if (type.equals("parrot")) {
            System.out.println("parrot is eating");
        } else if (type.equals("pigeon")) {
            System.out.println("pigeon is eating");
        }else{
            System.out.println("bird is eating");
        }

    }

    public void fly() {
        if (type.equals("peacock")) {
            System.out.println("Peacock is flying");
        } else if (type.equals("eagle")) {
            System.out.println("eagle is flying");
        } else if (type.equals("crow")) {
            System.out.println("crow is flying");
        } else if (type.equals("parrot")) {
            System.out.println("parrot is flying");
        } else if (type.equals("pigeon")) {
            System.out.println("pigeon is flying");
        }else{
            System.out.println("bird is flying");
        }
    }

    public void swim() {
        if (type.equals("peacock")) {
            System.out.println("Peacock cannot swim");
        } else if (type.equals("eagle")) {
            System.out.println("eagle cannot swim");
        } else if (type.equals("crow")) {
            System.out.println("crow cannot swim");
        } else if (type.equals("parrot")) {
            System.out.println("parrot cannot swim");
        } else if (type.equals("pigeon")) {
            System.out.println("pigeon cannot swim");
        }else{
            System.out.println("bird is swimming");
        }
    }

    public void makeSound() {
        if (type.equals("peacock")) {
            System.out.println("Peacock is making sound");
        } else if (type.equals("eagle")) {
            System.out.println("eagle is making sound");
        } else if (type.equals("crow")) {
            System.out.println("crow is making sound");
        } else if (type.equals("parrot")) {
            System.out.println("parrot is making sound");
        } else if (type.equals("pigeon")) {
            System.out.println("pigeon is making sound");
        }else{
            System.out.println("bird is making sound");
        }
    }
}
