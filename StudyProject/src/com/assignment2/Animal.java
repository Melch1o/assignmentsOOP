package com.assignment2;

public class Animal {

    protected String food;
    protected String location;


    public void makeNoise() {
        System.out.println("Bruuuh");
    }

    public void eat() {
        System.out.println("NomNomNom ");
    }

    public void sleep() {
        System.out.println("ZzZZzzzZZZzzZzZZ");
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

}
