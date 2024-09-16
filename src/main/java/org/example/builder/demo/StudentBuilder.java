package org.example.builder.demo;

public class StudentBuilder {

    private int id;
    private String name;
    private String course;
    private int age;
    private String gender;
    private String education;

    public void setId(int id) {
        //code for validating data type and value
        this.id = id;
    }

    public void setName(String name) {
        //code for validating data type and value
        this.name = name;
    }

    public void setCourse(String course) {
        //code for validating data type and value
        this.course = course;
    }

    public void setAge(int age) {
        //code for validating data type and value
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEducation() {
        return education;
    }
}
