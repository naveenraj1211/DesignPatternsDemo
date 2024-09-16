package org.example.solid_principles.bird.version5;

import org.example.solid_principles.bird.version5.behaviour_implementations.FlyHigh;
import org.example.solid_principles.bird.version5.behaviour_implementations.FlyLow;
import org.example.solid_principles.bird.version5.behaviours_interfaces.FlyingBehaviour;
import org.example.solid_principles.bird.version5.bird_implementations.Eagle;
import org.example.solid_principles.bird.version5.bird_implementations.Parrot;
import org.example.solid_principles.bird.version5.bird_implementations.Sparrow;
import org.example.solid_principles.bird.version5.bird_implementations.Vulture;

public class Client {

    public static void main(String[] args) {

        /**
         * problems with version 4 design:
         * 1. Tightly coupled
         * 2. Eagle, Sparrow and other child objects directly depends on another objects
         * 3. To change flying behaviour one bird a lot of code has to changed
         * 4. Method name both fly low and high classes is NOT the same
         * ----------------------------------------
         * Note: No 2 classes should be dependent eac other directly
         * They should be dependent via interface/abstraction only
         * ---------------------------------------
         * Use dependency inversion and injection
         * Meaning,
         * 1. Dependent classed no need to create dependent object using new keyword
         * 2. Using constructor or setters dependency object is injected
         */
        FlyingBehaviour flyLow = new FlyLow();
        FlyingBehaviour flyHigh = new FlyHigh();


        Vulture vulture = new Vulture(flyHigh);
        Eagle eagle = new Eagle(flyHigh);
        vulture.fly();
        eagle.fly();

        Sparrow sparrow = new Sparrow(flyLow);
        Parrot parrot = new Parrot(flyLow);
        sparrow.fly();
        parrot.fly();


    }
}
