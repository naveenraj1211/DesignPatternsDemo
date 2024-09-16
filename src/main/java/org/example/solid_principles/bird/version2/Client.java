package org.example.solid_principles.bird.version2;

public class Client {
    public static void main(String[] args) {
        FlyingSingingNonSwimmingBird b1 = new Parrot();
        b1.fly();
        b1.sing();



        /**
         * Class explosion:
         * We should NOT tie the behaviour to the class hierarchy.
         * For ex., If no of variable/behaviours is 3 (fly,swim,sing)
         * 2 * 2 * 2 = 8 classes
         * if n variable means 2^n classes
         */
        Bird b2 = new Penguin();
        b2.eat();
        // b2.fly();
        //b3.dance();
        //b4.cutTree()

    }


}
