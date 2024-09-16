package org.example.builder.demo;

public class StudentV2 {

    private int id;
    private String name;
    private String course;
    private int age;
    private String gender;
    private String education;

    public StudentV2(StudentBuilder builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.age = builder.getAge();
        this.course = builder.getCourse();
    }

}
