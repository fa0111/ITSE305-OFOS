package com.ofos.business;

/**
 * Author: Khalid Alrashdan
 * Student ID: 202302598
 * Use Case: UC-02 Browse/Search Restaurants
 * Test Class: RestaurantServiceTest — tests the Business Logic Layer
 */

import com.ofos.data.RestaurantRepository;
import com.ofos.model.Restaurant;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class RestaurantServiceTest {

    private RestaurantService service;

    @Before
    public void setUp() {
        RestaurantRepository repository = new RestaurantRepository();
        service = new RestaurantService(repository);
    }

    @Test
    public void testBrowseOpenRestaurants_OnlyReturnsOpen() {
        List<Restaurant> results = service.browseOpenRestaurants();
        for (Restaurant r : results) {
            assertTrue(r.isOpen());
        }
    }

    @Test
    public void testBrowseOpenRestaurants_ReturnsCorrectCount() {
        List<Restaurant> results = service.browseOpenRestaurants();
        assertEquals(5, results.size());
    }

    @Test
    public void testSearchRestaurants_ValidKeyword_ReturnsResults() {
        List<Restaurant> results = service.searchRestaurants("Pizza");
        assertEquals(2, results.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSearchRestaurants_EmptyKeyword_ThrowsException() {
        service.searchRestaurants("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSearchRestaurants_NullKeyword_ThrowsException() {
        service.searchRestaurants(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSearchRestaurants_BlankKeyword_ThrowsException() {
        service.searchRestaurants("   ");
    }

    @Test
    public void testGetRestaurantById_ValidId_ReturnsCorrectRestaurant() {
        Restaurant r = service.getRestaurantById("R003");
        assertEquals("Burger Boutique", r.getName());
    }

    @Test(expected = RuntimeException.class)
    public void testGetRestaurantById_InvalidId_ThrowsException() {
        service.getRestaurantById("R999");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetRestaurantById_EmptyId_ThrowsException() {
        service.getRestaurantById("");
    }
}