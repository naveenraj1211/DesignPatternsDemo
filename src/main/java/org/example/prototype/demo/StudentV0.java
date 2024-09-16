package org.example.prototype.demo;

public class StudentV0 {

    private String name;
    private int id;
    private String email;
    private int age;

    public StudentV0() {
    }

    public StudentV0(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public StudentV0(StudentV0 studentV0) {
        this.name = studentV0.name;
        this.email = studentV0.email;
        this.age = studentV0.age;
        this.id = studentV0.id;
    }

    public StudentV0 copy() {
        StudentV0 temp = new StudentV0();
        temp.name = this.name;
        temp.email = this.email;
        temp.age = this.age;
        temp.id = this.id;
        return temp;
    }
}
