package com.assignment2;

public class Horse extends Animal {

    private boolean isPacer;


    @Override
    public void makeNoise() {
        System.out.println("Neeeigh");
    }

    @Override
    public void eat() {
        System.out.println("NomNomNom... (Eating some grass)");
    }

    public Horse(String food) {
        this.food = food;
    }

    public Horse(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public Horse(String food, String location, boolean isPacer) {
        this(food, location);
        this.isPacer = isPacer;
    }

}
