package com.assignment2;

public class Student {

    protected String firstName = "There's no first name. Please set it";
    protected String lastName = "There's no last name. Please set it";
    protected String group = "There's no group. Please set it";
    protected double averageMark = 3;

    public int getScholarship() {
        if (averageMark == 5) return 100;
        else return 80;
    }

    public Student() {}

    public Student(String firstName) {
        this.firstName = firstName;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, String group) {
        this(firstName, lastName);
        this.group = group;
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this(firstName, lastName, group);
        this.averageMark = averageMark;
    }

    public Student(double averageMark) {
        this.averageMark = averageMark;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }
}


