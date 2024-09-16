package org.example.solid_principles.bird.version3;

public class Client {

    public static void main(String[] args) {

        // Birds Eagle, Vulture can fly high
        Vulture vulture = new Vulture();
        Eagle eagle = new Eagle();
        vulture.fly();
        eagle.fly();

        // Birds Sparrow, Parrot can fly low
        Sparrow sparrow = new Sparrow();
        Parrot parrot = new Parrot();
        sparrow.fly();
        parrot.fly();

        /**
         * Problem with above code is
         * fly method implementation is same in vulture and eagle - fly high code
         * Similarly, fly method implementation is same in sparrow and parrot - fly low code
         * Violating Reusability:
         * consider the scenario, where multiple child classes, have same behaviour
         * in this we have to do the same implementation multiple times
         */

    }
}
