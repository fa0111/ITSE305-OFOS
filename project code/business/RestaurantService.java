package com.ofos.business;

/**
 * Student: Khalid Alrashdan
 * Student ID: 202302598
 * Use Case: UC-02 Browse/Search Restaurants
 */

import com.ofos.data.RestaurantRepository;
import com.ofos.model.Restaurant;
import java.util.List;
import java.util.Optional;

public class RestaurantService {

    private RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<Restaurant> browseOpenRestaurants() {
        List<Restaurant> all = restaurantRepository.findAll();
        all.removeIf(r -> !r.isOpen());
        return all;
    }

    public List<Restaurant> searchRestaurants(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            throw new IllegalArgumentException("Search keyword cannot be empty.");
        }
        return restaurantRepository.searchByKeyword(keyword.trim());
    }

    public Restaurant getRestaurantById(String restaurantId) {
        if (restaurantId == null || restaurantId.trim().isEmpty()) {
            throw new IllegalArgumentException("Restaurant ID cannot be empty.");
        }
        Optional<Restaurant> found = restaurantRepository.findById(restaurantId.trim());
        if (found.isEmpty()) {
            throw new RuntimeException("No restaurant found with ID: " + restaurantId);
        }
        return found.get();
    }
}