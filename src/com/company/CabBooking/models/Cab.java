package com.company.CabBooking.models;

public class Cab{
    private static int UID=0;
    private long id;
    private String regNumber;
    private String name;
    private String brand;
    private String color;
    private Driver driver;

    public Cab(String regNumber, String name, String brand, String color, Driver driver) {
        this.id = UID;
        UID++;
        this.regNumber = regNumber;
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.driver = driver;
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

    public long getId() {
        return id;
    }

    public String getRegNumber() {
        return regNumber;
    }
}
