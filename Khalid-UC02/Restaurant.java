package com.ofos.model;

/**
 * Restaurant - Domain Entity (Model Layer)
 *
 * Represents a restaurant in the OFOS system.
 * Used in UC-02: Browse/Search Restaurants.
 *
 * Corresponds to the Restaurant entity defined in Phase 3, Table 3.4.
 *
 * Author: [Your Name]
 * Student ID: [Your ID]
 * Use Case: UC-02 Browse/Search Restaurants
 */
public class Restaurant {

    /** Unique identifier for the restaurant */
    private String restaurantId;

    /** Display name of the restaurant */
    private String name;

    /** Physical or delivery address */
    private String address;

    /** Category/cuisine type e.g. "Pizza", "Sushi", "Burgers" */
    private String category;

    /** Average star rating (0.0 - 5.0) */
    private double rating;

    /** Whether the restaurant is currently open and accepting orders */
    private boolean isOpen;

    /**
     * Constructs a Restaurant with all fields.
     *
     * @param restaurantId Unique ID
     * @param name         Restaurant name
     * @param address      Address
     * @param category     Cuisine category
     * @param rating       Star rating
     * @param isOpen       Whether currently open
     */
    public Restaurant(String restaurantId, String name, String address,
                      String category, double rating, boolean isOpen) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.address = address;
        this.category = category;
        this.rating = rating;
        this.isOpen = isOpen;
    }

    // ─── Getters ──────────────────────────────────────────────────────────────

    /** @return Unique restaurant ID */
    public String getRestaurantId() { return restaurantId; }

    /** @return Restaurant name */
    public String getName() { return name; }

    /** @return Restaurant address */
    public String getAddress() { return address; }

    /** @return Cuisine category */
    public String getCategory() { return category; }

    /** @return Average star rating */
    public double getRating() { return rating; }

    /** @return True if restaurant is currently open */
    public boolean isOpen() { return isOpen; }

    /**
     * Returns a readable summary of the restaurant.
     */
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
