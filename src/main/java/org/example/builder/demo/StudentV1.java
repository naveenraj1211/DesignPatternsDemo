package org.example.builder.demo;

import java.util.Map;

public class StudentV1 {

    int id;
    String name;
    String course;
    int age;
    String gender;
    String education;


    public StudentV1(Map<String, Object> studentMap) {
        this.id = (int) studentMap.get("id");
        this.name = (String) studentMap.get("name");
        this.course = (String) studentMap.get("course");
        this.age = (int) studentMap.get("age");
        //remaining attributes
    }
}
