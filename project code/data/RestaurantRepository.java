package com.ofos.data;

/**
 * Student: Khalid Alrashdan
 * Student ID: 202302598
 * Use Case: UC-02 Browse/Search Restaurants
 */

import com.ofos.model.Restaurant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RestaurantRepository {

    private List<Restaurant> database;

    public RestaurantRepository() {
        database = new ArrayList<>();
        seedData();
    }

    private void seedData() {
        database.add(new Restaurant("R001", "Pizza Hut",       "Block 318, Manama",   "Pizza",   4.2, true));
        database.add(new Restaurant("R002", "Pizza Roma",      "Block 210, Riffa",    "Pizza",   3.8, true));
        database.add(new Restaurant("R003", "Burger Boutique", "Block 405, Juffair",  "Burgers", 4.5, true));
        database.add(new Restaurant("R004", "Sushi House",     "Block 110, Seef",     "Sushi",   4.7, false));
        database.add(new Restaurant("R005", "Shawarma Palace", "Block 720, Isa Town", "Shawarma",3.9, true));
        database.add(new Restaurant("R006", "Burger King",     "Block 333, Hidd",     "Burgers", 4.0, true));
        database.add(new Restaurant("R007", "Noodle Bar",      "Block 512, Adliya",   "Asian",   4.3, false));
    }

    public List<Restaurant> findAll() {
        return new ArrayList<>(database);
    }

    public List<Restaurant> searchByKeyword(String keyword) {
        List<Restaurant> results = new ArrayList<>();
        String lowerKeyword = keyword.toLowerCase();

        for (Restaurant r : database) {
            if (r.getName().toLowerCase().contains(lowerKeyword) ||
                    r.getCategory().toLowerCase().contains(lowerKeyword)) {
                results.add(r);
            }
        }
        return results;
    }

    public Optional<Restaurant> findById(String restaurantId) {
        for (Restaurant r : database) {
            if (r.getRestaurantId().equals(restaurantId)) {
                return Optional.of(r);
            }
        }
        return Optional.empty();
    }
}