package com.company.professions;
import com.assignment1.Person;

public class Driver extends Person {

    private int drivingExp;

    @Override
    public String toString() {
        return " =About driver= \n" +
                "Full name: " + fullName + "\n" +
                "Age: " + age + "\n" +
                "Driving experience: " + drivingExp + "\n";
    }

    public Driver() {}

    public Driver(String fullName) {
        this.fullName = fullName;
    }

    public Driver(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Driver(String fullName, int age, int drivingExp) {
        this(fullName, age);
        this.drivingExp = drivingExp;
    }

    public void setDrivingExp(int drivingExp) {
        this.drivingExp = drivingExp;
    }

    public int getDrivingExp() {
        return drivingExp;
    }
}
