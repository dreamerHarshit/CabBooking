package com.company;

import com.company.CabBooking.models.Cab;
import com.company.CabBooking.models.Driver;
import com.company.CabBooking.models.Ride;
import com.company.CabBooking.models.Rider;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Registration reg = new Registration();
        Booking booking = new Booking(reg);

        //Register Driver
        Driver driver = reg.driver("Harish", "harshi@gmail.com", "90910191");
        driver.setLocation(0,11);
        driver.setAvailable(true);

        Driver driver2 = reg.driver("Ramesh", "ramesh@gmail.com", "90910191");
        driver2.setLocation(0,1);
        driver2.setAvailable(true);
        //Register Cab
        Cab cab = reg.cab("WagonR", "white", "UP-83-123","Maruti", driver);
        Cab cab2 = reg.cab("abc", "black", "xyz-123","toyota", driver2);

        //Register Rider
        Rider rider = reg.rider("Harshit", "harshit@gmail.com","99059920");

        //Book Ride
        booking.bookRide(rider.getId(), 0, 0, 1, 1);

        //Get History

        ArrayList<Ride> rides = booking.getRideHistory(rider.getId());
        for(Ride ride: rides){
            System.out.println("Ride by- "+ride.getRider().getName());
            System.out.println("cab name- "+ride.getCab().getName());
            System.out.println("driver name- "+ride.getCab().getDriver().getName());
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            System.out.println("Ride date- "+ride.getRideOn().format(myFormatObj));
        }
    }
}
