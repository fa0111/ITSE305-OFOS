package com.ofos.data;

import com.ofos.model.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * RestaurantRepository - Data Access Layer (DAL)
 *
 * Simulates a database of restaurants using an in-memory list.
 * In a real system this would use JDBC, Hibernate/ORM, or a JPA repository
 * to query an actual database (e.g. PostgreSQL / MySQL as described in Phase 3).
 *
 * Responsibilities:
 *   - Store restaurant records
 *   - Retrieve all restaurants
 *   - Search restaurants by name or category keyword
 *   - Find a single restaurant by ID
 *
 * Author: [Your Name]
 * Student ID: [Your ID]
 * Use Case: UC-02 Browse/Search Restaurants
 */
public class RestaurantRepository {

    /**
     * In-memory list acting as our "database table" of restaurants.
     * Pre-loaded with sample data to demonstrate the use case.
     */
    private List<Restaurant> database;

    /**
     * Constructor — initialises the repository with sample restaurant data.
     */
    public RestaurantRepository() {
        database = new ArrayList<>();
        seedData();
    }

    /**
     * Populates the repository with realistic sample restaurants.
     * This replaces a real DB seed/migration script for demonstration purposes.
     */
    private void seedData() {
        database.add(new Restaurant("R001", "Pizza Hut",        "Block 318, Manama",   "Pizza",   4.2, true));
        database.add(new Restaurant("R002", "Pizza Roma",       "Block 210, Riffa",    "Pizza",   3.8, true));
        database.add(new Restaurant("R003", "Burger Boutique",  "Block 405, Juffair",  "Burgers", 4.5, true));
        database.add(new Restaurant("R004", "Sushi House",      "Block 110, Seef",     "Sushi",   4.7, false));
        database.add(new Restaurant("R005", "Shawarma Palace",  "Block 720, Isa Town", "Shawarma",3.9, true));
        database.add(new Restaurant("R006", "Burger King",      "Block 333, Hidd",     "Burgers", 4.0, true));
        database.add(new Restaurant("R007", "Noodle Bar",       "Block 512, Adliya",   "Asian",   4.3, false));
    }

    /**
     * Returns every restaurant in the system regardless of status.
     *
     * @return Full list of all restaurants
     */
    public List<Restaurant> findAll() {
        return new ArrayList<>(database); // return a copy so callers cannot mutate the DB
    }

    /**
     * Searches restaurants whose name OR category contains the given keyword.
     * The search is case-insensitive to improve usability (QA-1).
     *
     * @param keyword The search term entered by the user (e.g. "Pizza", "burger")
     * @return List of matching restaurants; empty list if none found
     */
    public List<Restaurant> searchByKeyword(String keyword) {
        List<Restaurant> results = new ArrayList<>();
        String lowerKeyword = keyword.toLowerCase();

        for (Restaurant r : database) {
            boolean nameMatches     = r.getName().toLowerCase().contains(lowerKeyword);
            boolean categoryMatches = r.getCategory().toLowerCase().contains(lowerKeyword);

            if (nameMatches || categoryMatches) {
                results.add(r);
            }
        }
        return results;
    }

    /**
     * Finds a single restaurant by its unique ID.
     *
     * @param restaurantId The restaurant's unique identifier
     * @return An Optional containing the restaurant if found, or empty if not
     */
    public Optional<Restaurant> findById(String restaurantId) {
        for (Restaurant r : database) {
            if (r.getRestaurantId().equals(restaurantId)) {
                return Optional.of(r);
            }
        }
        return Optional.empty(); // not found — caller must handle this case
    }
}
