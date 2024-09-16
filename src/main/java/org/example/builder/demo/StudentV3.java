package org.example.builder.demo;

public class StudentV3 {

    private int id;
    private String name;
    private String course;
    private int age;
    private String gender;
    private String education;

    private StudentV3(Builder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.course = builder.course;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    public static class Builder {
        private int id;
        private String name;
        private String course;
        private int age;
        private String gender;
        private String education;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCourse(String course) {
            this.course = course;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setEducation(String education) {
            this.education = education;
            return this;
        }

        public StudentV3 build() {
            return new StudentV3(this);
        }

    }

    public static Builder getBuilder() {
        return new Builder();
    }


}
