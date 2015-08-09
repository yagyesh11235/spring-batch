package com.ig.demo;

public class Student {
    private String  grade;
    private String firstName;

    public Student() {

    }

    public Student(String firstName, String grade) {
        this.firstName = firstName;
        this.grade = grade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName + ", grade: " + grade;
    }

}
