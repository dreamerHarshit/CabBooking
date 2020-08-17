package com.company.CabBooking.models;

public class Ride {
    private Rider rider;
    private Driver driver;
    private Cab cab;
    private Location source;
    private Location destination;
    private long total_distance;

    public Ride(Rider rider, Driver driver, Cab cab, Location source, Location destination) {
        this.rider = rider;
        this.driver = driver;
        this.cab = cab;
        this.source = source;
        this.destination = destination;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public Location getSource() {
        return source;
    }

    public void setSource(Location source) {
        this.source = source;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public Rider getRider() {
        return rider;
    }
}
