package org.example.prototype.demo;

public class Client {

    public static void main(String[] args) {

        StudentV0 s1 = new StudentV0("naveen", "naveen1211.ssn@gmail.com");

        /** Problem with this copying:
         * Only reference is copied,
         * new object is not created
         */
        StudentV0 s2 = s1;


        /** Problem with this copying:
         * 1. Not reusable
         * 2. What if getter and setter is NOT there
         * 3. Client is doing the work
         * 4. Difficult for class with a lot of attributes
         */
        StudentV0 s3 = new StudentV0();
        // s3.name = s1.na


        /** Problem with this copying:
         * 1. copy constructor can accept child/subclass also
         * 2. Extra over headed of type checking
         */
        StudentV0 s4 = new StudentV0(s1);


        /** Prototype approach :
         * 1. Object is responsible for copying
         * 2. Child/subclass problem will not arrive, since we are overriding copy method in child class
         * 3. So, at runtime based on the object passed, copy method will be called.
         */
        StudentV0 s5= s1.copy();
    }

}
