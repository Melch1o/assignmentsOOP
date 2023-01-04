package com.assignment2;

public class Cat extends Animal {

    private int lives = 9;


    @Override
    public void makeNoise() {
        System.out.println("Meooow");
    }

    @Override
    public void eat() {
        System.out.println("NomNomNom");
    }

    public Cat(String food) {
        this.food = food;
    }

    public Cat(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public Cat(String food, String location, int lives) {
        this(food, location);
        this.lives = lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLives() {
        return lives;
    }

}
