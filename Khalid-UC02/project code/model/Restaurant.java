package com.ofos.model;

/**
 * Student: Khalid Alrashdan
 * Student ID: 202302598
 * Use Case: UC-02 Browse/Search Restaurants
 */
public class Restaurant {

    private String restaurantId;
    private String name;
    private String address;
    private String category;
    private double rating;
    private boolean isOpen;

    public Restaurant(String restaurantId, String name, String address,
                      String category, double rating, boolean isOpen) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.address = address;
        this.category = category;
        this.rating = rating;
        this.isOpen = isOpen;
    }

    public String getRestaurantId() { return restaurantId; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getCategory() { return category; }
    public double getRating() { return rating; }
    public boolean isOpen() { return isOpen; }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id='" + restaurantId + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", rating=" + rating +
                ", open=" + isOpen +
                ", address='" + address + '\'' +
                '}';
    }
}