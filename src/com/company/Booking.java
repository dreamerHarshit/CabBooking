package com.company;

import com.company.CabBooking.models.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Booking {
    HashMap<Long, ArrayList<Ride>> rides;
    Registration registered;

    public Booking(Registration registered) {
        this.rides = new HashMap<>();
        this.registered = registered;
    }

    public void bookRide(long rider_id, int source_x, int source_y, int destination_x, int destination_y){
        HashMap<Long, Rider> rider_map = registered.getRiders();
        Rider rider = rider_map.get(rider_id);
        Location source = new Location(source_x, source_y);
        Location destination = new Location(destination_x, destination_y);
        Driver driver = getCab(source);
        if(driver == null){
            System.out.println("No Cab Found.");
            return;
        }
        HashMap<Long, ArrayList<Cab>> driver_cabs = registered.getDriver_cabs();
        Cab cab = driver_cabs.get(driver.getId()).get(0);
        Ride ride = new Ride(rider, driver, cab, source, destination);
        if(this.rides.containsKey(rider_id)){
            this.rides.get(rider_id).add(ride);
        }
        else{
            ArrayList<Ride> rides_list = new ArrayList<>();
            rides_list.add(ride);
            this.rides.put(rider_id, rides_list);
        }

    }

    private Driver getCab(Location location){
        HashMap<Long, Driver> drivers = this.registered.getDrivers();
        for (Driver driver: drivers.values()){
            Location driver_location = driver.getLocation();
            int d_x = driver_location.getX();
            int d_y = driver_location.getY();
            int x = location.getX();
            int y = location.getY();
            int sq_x = (int) Math.pow(x-d_x, 2);
            int sq_y = (int) Math.pow(y-d_y, 2);
            double distance = Math.sqrt(sq_x+sq_y);
            if(distance<=10 && driver.isAvailable()){
                driver.setAvailable(false);
                return driver;
            }
        }
        return null;
    }

    public ArrayList<Ride> getRideHistory(long rider_id){
        return this.rides.get(rider_id);
    }
}
