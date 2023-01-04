package com.assignment1;

// Assignment 1: Person Class
public class Person {

    protected String fullName = "There's no name. Please, set it";
    protected int age = 0;

    public void move() {
        System.out.println(fullName + " is moving");
    }

    public void talk() {
        System.out.println(fullName + " is talking");
    }

    public Person() {}

    public Person (String fullName) {
        this.fullName = fullName;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
}
