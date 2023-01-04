package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {

    private int carryingCapacity;

    @Override
    public String toString() {
        return " =Car's configuration= \n" +
                "Brand: " + brand + "\n" +
                "Class: " + carClass + "\n" +
                "Weight: " + weight + "\n" +
                "Engine manufacturer: " + motor.getManufacturer() + "\n" +
                "Engine power: " + motor.getPower() + "\n" +
                "Carrying capacity: " + carryingCapacity + "\n" +
                "Driver's name: " + driver.getFullName() + "\n" +
                "Driver's driving experience: " + driver.getDrivingExp() + "\n";
    }

    public Lorry() {}

    public Lorry(String brand) {
        this.brand = brand;
    }

    public Lorry(String brand, String carClass) {
        this.brand = brand;
        this.carClass = carClass;
    }

    public Lorry(String brand, String carClass, double weight) {
        this(brand, carClass);
        this.weight = weight;
    }

    public Lorry(String brand, String carClass, double weight, Driver driver) {
        this(brand, carClass, weight);
        this.driver = driver;
    }

    public Lorry(String brand, String carClass, double weight, Driver driver, Engine motor) {
        this(brand, carClass, weight, driver);
        this.motor = motor;
    }

    public Lorry(String brand, String carClass, double weight, Driver driver, Engine motor, int carryingCapacity) {
        this(brand, carClass, weight, driver, motor);
        this.carryingCapacity = carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }
}
