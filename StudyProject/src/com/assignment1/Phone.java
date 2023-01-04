package com.assignment1;

// Assignment 1: Phone Class
public class Phone implements java.io.Serializable  {

    private String number = "There's no number. Please, set it";
    private String model = "There's no model. Please, set it";
    private double weight = 0;

    public void receiveCall(String name) {
        System.out.print(name + " is ringing");
    }

    public void receiveCall(String name, String num) {
        System.out.println(name + " (" + num + ") is ringing");
    }

    public void sendMessage(String... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    @Override
    public String toString() {
        return "Number: " + this.number + "\nModel: " + this.model + "\nWeight: " + this.weight + "\n";
    }

    public Phone() {}

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }
}



