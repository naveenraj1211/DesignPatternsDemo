package org.example.solid_principles.bird.version0;

public class Client {

    /**
     *
     * Issues in Bird Class:
     * 1. SRP violated - Doing too many things - eat, fly, swing, make sound
     * 2. OCP violated - Adding a new bird support requires a lot of changes in code
     * 3. Readability - Difficult to read with multiple if-else statements
     * 4. Testing - each type has to tested separately
     * 5. merge conflict when multiple dev are working
     * 6. code is not reusable
     */
    public static void main(String[] args) {

        Bird b1 = new Bird();

        b1.type = "eagle";
        b1.name = "garuda";
        b1.eat();
        b1.fly();

        Bird b2 = new Bird();
        b2.type = "parrot";
        b2.gender = "female";
        b2.makeSound();
        b2.swim();
    }


}
