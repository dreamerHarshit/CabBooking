package com.company.CabBooking.models;

public class Cab{
    private String reg_number;
    private String name;
    private String brand;
    private String color;
    private Driver driver;

    public Cab(String reg_number, String name, String brand, String color, Driver driver) {
        this.reg_number = reg_number;
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.driver = driver;
    }

    public String getReg_number() {
        return reg_number;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
