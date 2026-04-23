package com.ofos.model;

/**
 * Author: Khalid Alrashdan
 * Student ID: 202302598
 * Use Case: UC-02 Browse/Search Restaurants
 * Test Class: RestaurantTest — tests the Restaurant domain entity
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

    private Restaurant restaurant;

    @Before
    public void setUp() {
        restaurant = new Restaurant("R001", "Pizza Hut", "Block 318, Manama",
                "Pizza", 4.2, true);
    }

    @Test
    public void testGetRestaurantId() {
        assertEquals("R001", restaurant.getRestaurantId());
    }

    @Test
    public void testGetName() {
        assertEquals("Pizza Hut", restaurant.getName());
    }

    @Test
    public void testGetAddress() {
        assertEquals("Block 318, Manama", restaurant.getAddress());
    }

    @Test
    public void testGetCategory() {
        assertEquals("Pizza", restaurant.getCategory());
    }

    @Test
    public void testGetRating() {
        assertEquals(4.2, restaurant.getRating(), 0.001);
    }

    @Test
    public void testIsOpen_WhenOpen() {
        assertTrue(restaurant.isOpen());
    }

    @Test
    public void testIsOpen_WhenClosed() {
        Restaurant closedRestaurant = new Restaurant("R002", "Sushi House",
                "Block 110, Seef", "Sushi", 4.7, false);
        assertFalse(closedRestaurant.isOpen());
    }

    @Test
    public void testToString_ContainsName() {
        assertTrue(restaurant.toString().contains("Pizza Hut"));
    }
}