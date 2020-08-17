package com.company.CabBooking.models;

public class Driver extends User {
    private boolean available = false;
    public Driver(String name, String email_id, String phone_no) {
        super(name, email_id, phone_no);
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
