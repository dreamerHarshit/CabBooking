package com.company;

import com.company.CabBooking.models.Cab;
import com.company.CabBooking.models.Driver;
import com.company.CabBooking.models.Ride;
import com.company.CabBooking.models.Rider;

import java.util.ArrayList;
import java.util.HashMap;

public class Registration {
    HashMap<Long, Rider> riders;
    HashMap<Long, Driver> drivers;
    HashMap<Long, Cab> cabs;
    HashMap<Long, ArrayList<Cab>> driver_cabs;

    public Registration() {
        this.riders = new HashMap<>();
        this.drivers = new HashMap<>();
        this.cabs = new HashMap<>();
        this.driver_cabs = new HashMap<>();
    }

    public Driver driver(String name, String email, String phone){
        Driver driver = new Driver(name, email, phone);
        this.drivers.put(driver.getId(), driver);
        ArrayList<Cab> cabs = new ArrayList<>();
        driver_cabs.put(driver.getId(), cabs);
        return driver;
    }

    public Rider rider(String name, String email, String phone){
        Rider rider = new Rider(name, email, phone);
        this.riders.put(rider.getId(), rider);
        return rider;
    }

    public Cab cab(String name, String color, String reg_no, String brand, Driver driver){
        Cab cab = new Cab(reg_no, name , brand, color, driver);
        if(this.driver_cabs.containsKey(driver.getId())){
            this.driver_cabs.get(driver.getId()).add(cab);
        }
        else{
            ArrayList<Cab> cabs = new ArrayList<>();
            cabs.add(cab);
            this.driver_cabs.put(driver.getId(), cabs);
        }
        return cab;
    }

    public HashMap<Long, Rider> getRiders() {
        return riders;
    }

    public HashMap<Long, Driver> getDrivers() {
        return drivers;
    }

    public HashMap<Long, Cab> getCabs() {
        return cabs;
    }

    public HashMap<Long, ArrayList<Cab>> getDriver_cabs() {
        return driver_cabs;
    }
}
