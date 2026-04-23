package com.ofos.business;

import com.ofos.data.RestaurantRepository;
import com.ofos.model.Restaurant;

import java.util.List;
import java.util.Optional;

/**
 * RestaurantService - Business Logic Layer (BLL)
 *
 * Contains all business rules and logic for UC-02: Browse/Search Restaurants.
 * This layer sits between the Presentation layer and the Data layer —
 * it does NOT talk to the UI and does NOT touch the database directly.
 *
 * Business rules enforced here:
 *   - Search keyword must not be null or blank
 *   - Results are filtered to only show open restaurants when browsing all
 *   - A restaurant ID must be valid before returning details
 *
 * This matches the Restaurant Browsing Module described in Phase 3, Step 5.
 *
 * Author: [Your Name]
 * Student ID: [Your ID]
 * Use Case: UC-02 Browse/Search Restaurants
 */
public class RestaurantService {

    /**
     * The data-layer repository this service depends on.
     * In a real Spring app, this would be @Autowired (Dependency Injection).
     */
    private RestaurantRepository restaurantRepository;

    /**
     * Constructor — receives the repository (manual dependency injection).
     *
     * @param restaurantRepository The DAL repository to use
     */
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    /**
     * Returns all restaurants that are currently OPEN.
     * Guests and customers use this to browse available options (UC-02).
     *
     * Business rule: closed restaurants are hidden from the browse list.
     *
     * @return List of open restaurants
     */
    public List<Restaurant> browseOpenRestaurants() {
        List<Restaurant> all = restaurantRepository.findAll();

        // Business rule: only show restaurants that are currently open
        all.removeIf(r -> !r.isOpen());

        return all;
    }

    /**
     * Searches restaurants by a user-supplied keyword.
     * Matches against restaurant name and cuisine category.
     *
     * Business rules:
     *   - Keyword cannot be null or blank (throws IllegalArgumentException)
     *   - Search is delegated to the repository for data retrieval
     *
     * @param keyword The search term (e.g. "Pizza", "Burger")
     * @return List of matching restaurants (may be empty — never null)
     * @throws IllegalArgumentException if keyword is null or blank
     */
    public List<Restaurant> searchRestaurants(String keyword) {
        // ── Business Rule: validate input ─────────────────────────────────────
        if (keyword == null || keyword.trim().isEmpty()) {
            throw new IllegalArgumentException("Search keyword cannot be empty.");
        }

        // Delegate actual data lookup to the repository (separation of concerns)
        List<Restaurant> results = restaurantRepository.searchByKeyword(keyword.trim());

        return results; // caller decides what to show if list is empty
    }

    /**
     * Retrieves the full details of a specific restaurant by its ID.
     * Used when a user taps/clicks on a restaurant from the list (UC-03 extends this).
     *
     * @param restaurantId The unique ID of the restaurant
     * @return The Restaurant object
     * @throws IllegalArgumentException if the ID is null/blank
     * @throws RuntimeException         if no restaurant is found with that ID
     */
    public Restaurant getRestaurantById(String restaurantId) {
        // ── Business Rule: ID must be provided ────────────────────────────────
        if (restaurantId == null || restaurantId.trim().isEmpty()) {
            throw new IllegalArgumentException("Restaurant ID cannot be empty.");
        }

        Optional<Restaurant> found = restaurantRepository.findById(restaurantId.trim());

        // ── Business Rule: restaurant must exist ─────────────────────────────
        if (found.isEmpty()) {
            throw new RuntimeException("No restaurant found with ID: " + restaurantId);
        }

        return found.get();
    }
}
