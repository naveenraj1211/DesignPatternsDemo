package org.example.solid_principles.bird.version4;

import org.example.solid_principles.bird.version4.Eagle;
import org.example.solid_principles.bird.version4.Parrot;
import org.example.solid_principles.bird.version4.Sparrow;
import org.example.solid_principles.bird.version4.Vulture;

public class Client {

    public static void main(String[] args) {

        /**
         * To fix the code duplication problem:
         * 1. use the helper classes
         */

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



    }
}
