package com.company.details;

public class Engine {

    private int power;
    private String manufacturer;

    @Override
    public String toString() {
        return " =Engine configuration= \n" +
                "Power: " + power + "\n" +
                "Manufacturer: " + manufacturer + "\n";
    }

    public Engine() {}

    public Engine(int power) {
        this.power = power;
    }

    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPower() {
        return power;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
