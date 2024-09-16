package org.example.builder.demo;

import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {

        /**
         * Problem with constructor approach
         * 1. Multiple constructors - Telescopic constructor
         * 2. Order of the argument matters
         * 3. Client needs to well aware the of all the fields
         *
         */
        StudentV0 s1 = new StudentV0(12, "naveen");
        StudentV0 s2 = new StudentV0(12, "naveen", "java");
        StudentV0 s3 = new StudentV0(13, "naveen", "python", 27);


        /**
         * Problem with HashMap approach
         * 1. No check on the data-type of the value
         * 2. No check on what key name is used to set
         * 3. No check on no of attributes/size of map
         *
         */
        Map<String, Object> map = new HashMap<>();
        map.put("id", "xyz");
        map.put("Name", "naveen");
        map.put("cours", "pythno");
        StudentV1 s4 = new StudentV1(map);


        /**
         * Problem with outer builder class approach
         * 1. Client is responsible for creating builder object
         * 2. Not easy to use
         * 3. Changing parameter requires change in two class files
         */
        StudentBuilder builder = new StudentBuilder();
        builder.setId(12);
        builder.setName("navene");
        builder.setCourse("java");
        StudentV2 s5 = new StudentV2(builder);


        /**
         * Uses public inner class, method chaining, private constructor, setters
         * 1. Immutable object - Client cannot change attributes student object once created
         * 2. More readable
         * 3. Easy to maintain complex object with many attributes
         */
        StudentV3 s6 = StudentV3.getBuilder()
                .setId(11)
                .setName("naveen")
                .setCourse("java")
                .setAge(27)
                .setGender("male")
                .build();

    }
}
