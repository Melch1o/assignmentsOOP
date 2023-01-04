package com.company.vehicles;
import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {

    protected String brand = "There's no brand. Please, set it";
    protected String carClass = "There's no class. Please, set it";
    protected double weight = 0;
    protected Driver driver;
    protected Engine motor;

    public void start() {
        System.out.println("Let's start! Whrooooooom");
    }

    public void stop() {
        System.out.println("Let's stop :(");
    }

    public void turnRight() {
        System.out.println("Turn right! Kchau");
    }

    public void turnLeft() {
        System.out.println("Turn left! Kchau");
    }

    @Override
    public String toString() {
        return " =Car's configuration= \n" +
                "Brand: " + brand + "\n" +
                "Class: " + carClass + "\n" +
                "Weight: " + weight + "\n" +
                "Engine manufacturer: " + motor.getManufacturer() + "\n" +
                "Engine power: " + motor.getPower() + "\n" +
                "Driver's name: " + driver.getFullName() + "\n" +
                "Driver's driving experience: " + driver.getDrivingExp() + "\n";
    }

    public Car() {}

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String carClass) {
        this.brand = brand;
        this.carClass = carClass;
    }

    public Car(String brand, String carClass, double weight) {
        this(brand, carClass);
        this.weight = weight;
    }

    public Car(String brand, String carClass, double weight, Driver driver) {
        this(brand, carClass, weight);
        this.driver = driver;
    }

    public Car(String brand, String carClass, double weight, Driver driver, Engine motor) {
        this(brand, carClass, weight, driver);
        this.motor = motor;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

    public String getBrand() {
        return brand;
    }

    public String getCarClass() {
        return carClass;
    }

    public double getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getMotor() {
        return motor;
    }
}
