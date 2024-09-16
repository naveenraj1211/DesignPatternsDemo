package org.example.builder.demo;

public class StudentV0 {

    int id;
    String name;
    String course;
    int age;
    String gender;
    String education;

    public StudentV0() {
    }

    public StudentV0(int id) {
        this.id = id;
    }

    public StudentV0(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentV0(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public StudentV0(int id, String name, String course, int age) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.age = age;
    }
}
