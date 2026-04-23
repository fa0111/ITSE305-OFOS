package com.ofos.presentation;

/**
 * Author: Khalid Alrashdan
 * Student ID: 202302598
 * Use Case: UC-02 Browse/Search Restaurants
 * Test Class: RestaurantControllerTest — tests the Presentation Layer
 */

import com.ofos.business.RestaurantService;
import com.ofos.data.RestaurantRepository;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class RestaurantControllerTest {

    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;
    private java.io.InputStream originalIn;

    @Before
    public void setUp() {
        originalOut = System.out;
        originalIn  = System.in;
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    private RestaurantController createControllerWithInput(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        RestaurantRepository repository = new RestaurantRepository();
        RestaurantService service = new RestaurantService(repository);
        return new RestaurantController(service);
    }

    @Test
    public void testBrowseAll_OutputContainsRestaurantName() {
        RestaurantController controller = createControllerWithInput("1\n0\n");
        controller.run();
        assertTrue(outputStream.toString().contains("Pizza Hut"));
    }

    @Test
    public void testBrowseAll_DoesNotShowClosedRestaurants() {
        RestaurantController controller = createControllerWithInput("1\n0\n");
        controller.run();
        assertFalse(outputStream.toString().contains("Sushi House"));
    }

    @Test
    public void testSearch_Pizza_ShowsResults() {
        RestaurantController controller = createControllerWithInput("2\nPizza\n0\n");
        controller.run();
        assertTrue(outputStream.toString().contains("Pizza Hut"));
    }

    @Test
    public void testSearch_EmptyKeyword_ShowsError() {
        RestaurantController controller = createControllerWithInput("2\n\n0\n");
        controller.run();
        assertTrue(outputStream.toString().contains("Error"));
    }

    @Test
    public void testViewDetails_ValidId_ShowsDetails() {
        RestaurantController controller = createControllerWithInput("3\nR001\n0\n");
        controller.run();
        assertTrue(outputStream.toString().contains("Pizza Hut"));
    }

    @Test
    public void testViewDetails_InvalidId_ShowsError() {
        RestaurantController controller = createControllerWithInput("3\nR999\n0\n");
        controller.run();
        assertTrue(outputStream.toString().contains("Error"));
    }

    @Test
    public void testRun_ShowsWelcomeBanner() {
        RestaurantController controller = createControllerWithInput("0\n");
        controller.run();
        assertTrue(outputStream.toString().contains("OFOS"));
    }

    @Test
    public void testRun_InvalidOption_ShowsError() {
        RestaurantController controller = createControllerWithInput("9\n0\n");
        controller.run();
        assertTrue(outputStream.toString().contains("Invalid option"));
    }
}