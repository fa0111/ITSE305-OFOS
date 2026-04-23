package com.ofos.presentation;

/**
 * Student: Khalid Alrashdan
 * Student ID: 202302598
 * Use Case: UC-02 Browse/Search Restaurants
 */

import com.ofos.business.RestaurantService;
import com.ofos.data.RestaurantRepository;
import com.ofos.model.Restaurant;
import java.util.List;
import java.util.Scanner;

public class RestaurantController {

    private RestaurantService restaurantService;
    private Scanner scanner;

    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("OFOS - Browse / Search Restaurants");

        boolean running = true;
        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1": handleBrowseAll();   break;
                case "2": handleSearch();      break;
                case "3": handleViewDetails(); break;
                case "0":
                    System.out.println("Exiting OFOS. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please enter 0, 1, 2, or 3.");
            }
        }
    }

    private void printMenu() {
        System.out.println("  1. Browse all open restaurants");
        System.out.println("  2. Search restaurants by keyword");
        System.out.println("  3. View restaurant details by ID");
        System.out.println("  0. Exit");
        System.out.print("  Enter choice: ");
    }

    private void handleBrowseAll() {
        System.out.println("\nAll Open Restaurants:");
        List<Restaurant> restaurants = restaurantService.browseOpenRestaurants();

        if (restaurants.isEmpty()) {
            System.out.println("  No restaurants are currently open.");
        } else {
            System.out.printf("  %-6s %-20s %-12s %-8s %s%n", "ID", "Name", "Category", "Rating", "Address");
            for (Restaurant r : restaurants) {
                System.out.printf("  %-6s %-20s %-12s %-8.1f %s%n",
                        r.getRestaurantId(), r.getName(), r.getCategory(), r.getRating(), r.getAddress());
            }
            System.out.println("\n  Total: " + restaurants.size() + " open restaurant(s).");
        }
    }

    private void handleSearch() {
        System.out.print("\nEnter search keyword (e.g. Pizza, Burger): ");
        String keyword = scanner.nextLine();
        try {
            List<Restaurant> results = restaurantService.searchRestaurants(keyword);
            System.out.println("\n  Results for \"" + keyword + "\":");
            if (results.isEmpty()) {
                System.out.println("  No restaurants found matching \"" + keyword + "\".");
            } else {
                for (Restaurant r : results) {
                    String status = r.isOpen() ? "Open" : "Closed";
                    System.out.printf("  [%s] %s (%s) | %.1f stars | %s | %s%n",
                            r.getRestaurantId(), r.getName(), r.getCategory(),
                            r.getRating(), status, r.getAddress());
                }
                System.out.println("  " + results.size() + " result(s) found.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void handleViewDetails() {
        System.out.print("\nEnter Restaurant ID (e.g. R001): ");
        String id = scanner.nextLine();
        try {
            Restaurant r = restaurantService.getRestaurantById(id);
            System.out.println("\n  -- Restaurant Details --");
            System.out.println("  ID       : " + r.getRestaurantId());
            System.out.println("  Name     : " + r.getName());
            System.out.println("  Category : " + r.getCategory());
            System.out.println("  Rating   : " + r.getRating() + " / 5.0");
            System.out.println("  Address  : " + r.getAddress());
            System.out.println("  Status   : " + (r.isOpen() ? "Open" : "Closed"));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        RestaurantRepository repository = new RestaurantRepository();
        RestaurantService service       = new RestaurantService(repository);
        RestaurantController controller = new RestaurantController(service);
        controller.run();
    }
}