package com.company.CabBooking.models;

public abstract class User {
    private static long UID=0;
    private long id;
    private String name;
    private String email_id;
    private long rating;
    private String phone_no;
    private Location location;
    public User(String name, String email_id, String phone_no) {
        this.id = UID;
        UID++;
        this.name = name;
        this.email_id = email_id;
        this.phone_no = phone_no;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(int x, int y) {
        Location location = new Location(x, y);
        this.location = location;
    }

}
