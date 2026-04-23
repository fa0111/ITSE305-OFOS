package com.ofos.presentation;

import com.ofos.business.RestaurantService;
import com.ofos.model.Restaurant;

import java.util.List;
import java.util.Scanner;

/**
 * RestaurantController - Presentation Layer
 *
 * The entry point for UC-02: Browse/Search Restaurants.
 * This layer handles ALL user interaction — it reads input, calls the
 * business layer, and displays results. It does NOT contain any business
 * logic or database code.
 *
 * In a real web app this would be a REST controller (e.g. Spring @RestController)
 * returning JSON. Here we use a console UI to keep it runnable without a server.
 *
 * Flow (matches Phase 1 UC-02 description):
 *   1. Show menu: Browse all OR Search by keyword
 *   2. Call RestaurantService (Business Layer)
 *   3. Display results to the user
 *   4. Handle "no results" exception from the service
 *
 * Author: [Your Name]
 * Student ID: [Your ID]
 * Use Case: UC-02 Browse/Search Restaurants
 */
public class RestaurantController {

    /**
     * The business-layer service this controller depends on.
     * The controller never touches the repository directly — always goes via the service.
     */
    private RestaurantService restaurantService;

    /** Scanner for reading user input from the console */
    private Scanner scanner;

    /**
     * Constructor — wires up the service dependency.
     *
     * @param restaurantService The BLL service to call
     */
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
        this.scanner = new Scanner(System.in);
    }

    /**
     * Main loop for UC-02.
     * Shows the browse/search menu and handles user choices until they exit.
     */
    public void run() {
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   OFOS - Browse / Search Restaurants     ║");
        System.out.println("║   UC-02 | ITSE302 Software Architecture  ║");
        System.out.println("╚══════════════════════════════════════════╝");

        boolean running = true;

        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    handleBrowseAll();
                    break;
                case "2":
                    handleSearch();
                    break;
                case "3":
                    handleViewDetails();
                    break;
                case "0":
                    System.out.println("\nExiting OFOS. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("⚠  Invalid option. Please enter 0, 1, 2, or 3.\n");
            }
        }
    }

    /**
     * Displays the main menu options to the user.
     */
    private void printMenu() {
        System.out.println("\n──────────────────────────────────────────");
        System.out.println("  1. Browse all open restaurants");
        System.out.println("  2. Search restaurants by keyword");
        System.out.println("  3. View restaurant details by ID");
        System.out.println("  0. Exit");
        System.out.print("  Enter choice: ");
    }

    /**
     * Handles option 1 — browse all currently open restaurants.
     * Calls the business layer and displays the results in a formatted table.
     */
    private void handleBrowseAll() {
        System.out.println("\n📋 All Open Restaurants:");
        System.out.println("──────────────────────────────────────────────────────────────");

        // ── Call Business Layer ───────────────────────────────────────────────
        List<Restaurant> restaurants = restaurantService.browseOpenRestaurants();

        if (restaurants.isEmpty()) {
            // UC-02 Exception: No results found
            System.out.println("  No restaurants are currently open. Please try again later.");
        } else {
            // Display results
            System.out.printf("  %-6s %-20s %-12s %-8s %s%n",
                              "ID", "Name", "Category", "Rating", "Address");
            System.out.println("  ──────────────────────────────────────────────────────────");
            for (Restaurant r : restaurants) {
                System.out.printf("  %-6s %-20s %-12s %-8.1f %s%n",
                                  r.getRestaurantId(),
                                  r.getName(),
                                  r.getCategory(),
                                  r.getRating(),
                                  r.getAddress());
            }
            System.out.println("\n  Total: " + restaurants.size() + " open restaurant(s) found.");
        }
    }

    /**
     * Handles option 2 — search restaurants by keyword.
     * Reads the keyword from the user, calls the service, and shows results.
     * Handles the case where the keyword is blank (caught from the service).
     */
    private void handleSearch() {
        System.out.print("\n🔍 Enter search keyword (e.g. Pizza, Burger): ");
        String keyword = scanner.nextLine();

        try {
            // ── Call Business Layer ───────────────────────────────────────────
            List<Restaurant> results = restaurantService.searchRestaurants(keyword);

            System.out.println("\n  Search results for \"" + keyword + "\":");
            System.out.println("  ──────────────────────────────────────────────────────────");

            if (results.isEmpty()) {
                // UC-02 Exception: no restaurants match the search
                System.out.println("  No restaurants found matching \"" + keyword + "\".");
            } else {
                for (Restaurant r : results) {
                    String status = r.isOpen() ? "🟢 Open" : "🔴 Closed";
                    System.out.printf("  [%s] %s (%s) | ⭐ %.1f | %s | %s%n",
                                      r.getRestaurantId(),
                                      r.getName(),
                                      r.getCategory(),
                                      r.getRating(),
                                      status,
                                      r.getAddress());
                }
                System.out.println("\n  " + results.size() + " result(s) found.");
            }

        } catch (IllegalArgumentException e) {
            // Business layer rejected the empty keyword — show friendly message
            System.out.println("⚠  Error: " + e.getMessage());
        }
    }

    /**
     * Handles option 3 — view full details of one restaurant by ID.
     * Reads the ID, calls the service, and prints all restaurant fields.
     */
    private void handleViewDetails() {
        System.out.print("\n🏪 Enter Restaurant ID (e.g. R001): ");
        String id = scanner.nextLine();

        try {
            // ── Call Business Layer ───────────────────────────────────────────
            Restaurant r = restaurantService.getRestaurantById(id);

            System.out.println("\n  ── Restaurant Details ─────────────────────────");
            System.out.println("  ID       : " + r.getRestaurantId());
            System.out.println("  Name     : " + r.getName());
            System.out.println("  Category : " + r.getCategory());
            System.out.println("  Rating   : " + r.getRating() + " / 5.0");
            System.out.println("  Address  : " + r.getAddress());
            System.out.println("  Status   : " + (r.isOpen() ? "Open ✅" : "Closed ❌"));

        } catch (IllegalArgumentException | RuntimeException e) {
            // Restaurant not found or invalid ID
            System.out.println("⚠  Error: " + e.getMessage());
        }
    }

    /**
     * Application entry point.
     *
     * Wires together all three layers manually (no Spring framework needed to run):
     *   Data Layer    → RestaurantRepository
     *   Business Layer → RestaurantService (uses repository)
     *   Presentation  → RestaurantController (uses service)
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        // ── Wire up the three layers ──────────────────────────────────────────
        com.ofos.data.RestaurantRepository repository =
                new com.ofos.data.RestaurantRepository();           // Data Layer

        RestaurantService service =
                new RestaurantService(repository);                  // Business Layer

        RestaurantController controller =
                new RestaurantController(service);                  // Presentation Layer

        // ── Start the application ─────────────────────────────────────────────
        controller.run();
    }
}
