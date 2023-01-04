package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{

    private double maxSpeed = 0;

    @Override
    public String toString() {
        return " =Car's configuration= \n" +
                "Brand: " + brand + "\n" +
                "Class: " + carClass + "\n" +
                "Weight: " + weight + "\n" +
                "Engine manufacturer: " + motor.getManufacturer() + "\n" +
                "Engine power: " + motor.getPower() + "\n" +
                "Top speed  " + maxSpeed + "\n" +
                "Driver's name: " + driver.getFullName() + "\n" +
                "Driver's driving experience: " + driver.getDrivingExp() + "\n";
    }

    public SportCar() {}

    public SportCar(String brand) {
        this.brand = brand;
    }

    public SportCar(String brand, String carClass) {
        this.brand = brand;
        this.carClass = carClass;
    }

    public SportCar(String brand, String carClass, double weight) {
        this(brand, carClass);
        this.weight = weight;
    }

    public SportCar(String brand, String carClass, double weight, Driver driver) {
        this(brand, carClass, weight);
        this.driver = driver;
    }

    public SportCar(String brand, String carClass, double weight, Driver driver, Engine motor) {
        this(brand, carClass, weight, driver);
        this.motor = motor;
    }

    public SportCar(String brand, String carClass, double weight, Driver driver, Engine motor, int maxSpeed) {
        this(brand, carClass, weight, driver, motor);
        this.maxSpeed = maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}
