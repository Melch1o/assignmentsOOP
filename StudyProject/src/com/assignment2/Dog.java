package com.assignment2;

public class Dog extends Animal {



    @Override
    public void makeNoise() {
        System.out.println("Wooof");
    }

    @Override
    public void eat() {
        System.out.println("NomNomNom... (Eating some meat)");
    }

    public Dog(String food) {
        this.food = food;
    }

    public Dog(String food, String location) {
        this.food = food;
        this.location = location;
    }

}
