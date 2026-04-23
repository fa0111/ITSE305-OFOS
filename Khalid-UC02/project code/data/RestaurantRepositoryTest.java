package com.ofos.data;

/**
 * Author: Khalid Alrashdan
 * Student ID: 202302598
 * Use Case: UC-02 Browse/Search Restaurants
 * Test Class: RestaurantRepositoryTest — tests the Data Layer
 */

import com.ofos.model.Restaurant;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.Optional;
import static org.junit.Assert.*;

public class RestaurantRepositoryTest {

    private RestaurantRepository repository;

    @Before
    public void setUp() {
        repository = new RestaurantRepository();
    }

    @Test
    public void testFindAll_ReturnsAllRestaurants() {
        List<Restaurant> all = repository.findAll();
        assertEquals(7, all.size());
    }

    @Test
    public void testFindAll_NotNull() {
        assertNotNull(repository.findAll());
    }

    @Test
    public void testSearchByKeyword_Pizza_ReturnsTwoResults() {
        List<Restaurant> results = repository.searchByKeyword("Pizza");
        assertEquals(2, results.size());
    }

    @Test
    public void testSearchByKeyword_Burger_ReturnsTwoResults() {
        List<Restaurant> results = repository.searchByKeyword("Burger");
        assertEquals(2, results.size());
    }

    @Test
    public void testSearchByKeyword_NoMatch_ReturnsEmptyList() {
        List<Restaurant> results = repository.searchByKeyword("XYZUnknown");
        assertTrue(results.isEmpty());
    }

    @Test
    public void testSearchByKeyword_CaseInsensitive() {
        List<Restaurant> lower = repository.searchByKeyword("pizza");
        List<Restaurant> upper = repository.searchByKeyword("PIZZA");
        assertEquals(lower.size(), upper.size());
    }

    @Test
    public void testFindById_ValidId_ReturnsRestaurant() {
        Optional<Restaurant> result = repository.findById("R001");
        assertTrue(result.isPresent());
        assertEquals("Pizza Hut", result.get().getName());
    }

    @Test
    public void testFindById_InvalidId_ReturnsEmpty() {
        Optional<Restaurant> result = repository.findById("R999");
        assertFalse(result.isPresent());
    }
}