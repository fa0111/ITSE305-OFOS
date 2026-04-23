package presentation;

import business.MenuResult;
import business.MenuService;
import data.MenuItem;

import java.util.List;

/**
 * ============================================================
 * OFOS - Online Food Ordering System
 * UC-03: View Menus
 * ============================================================
 *
 * PRESENTATION LAYER - MenuController
 *
 * The Controller is responsible for handling user interactions and
 * translating them into calls to the Business layer (MenuService).
 * It then formats and displays the results back to the user.
 *
 * In a web application this would be a REST controller (e.g., Spring MVC)
 * responding to HTTP GET /api/menu?restaurantId=R001.
 * In this console simulation it prints formatted output to System.out.
 *
 * Architecture role (Phase 3, Step 5):
 *   - Part of the Presentation Layer
 *   - Controller Module: handles UI events, forwards requests to server
 *   - Interface: Presentation ↔ Business via service method calls
 *
 * UC-03 Flow handled here:
 *   1. Receive restaurantId from user (or URL parameter)
 *   2. Call MenuService.getMenuForRestaurant(restaurantId)
 *   3. If success  → display formatted menu to user
 *   4. If failure  → display appropriate error message
 */
public class MenuController {

    /**
     * The business service that processes the menu retrieval logic.
     * Injected through the constructor (Dependency Injection principle).
     */
    private final MenuService menuService;

    /**
     * Constructs the MenuController with its required business service.
     *
     * @param menuService The service containing UC-03 business logic
     */
    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    /**
     * Entry point for UC-03: handles a user's request to view a restaurant's menu.
     *
     * This method simulates what would happen when a customer clicks on a
     * restaurant in the app. The restaurantId would normally come from the
     * URL route, e.g., GET /restaurants/{restaurantId}/menu
     *
     * UC-03 Use Case Scenario (S1):
     *   "Hassan selects 'Pizza Hut'. The system displays Pizza Hut's menu
     *    with prices. He scrolls through available items."
     *
     * @param restaurantId   The unique ID of the selected restaurant
     * @param restaurantName The display name of the restaurant (for UI output)
     */
    public void viewMenu(String restaurantId, String restaurantName) {

        // Display the page header / restaurant banner
        printSectionHeader("Viewing Menu: " + restaurantName);

        // Delegate to business layer - this enforces all business rules (BR1-BR3)
        MenuResult result = menuService.getMenuForRestaurant(restaurantId);

        if (result.isSuccess()) {
            // Success path: display all available menu items
            displayMenu(result, restaurantName);
        } else {
            // Exception path (UC-03): "Menu unavailable → system shows message"
            displayError(result.getErrorMessage());
        }
    }

    /**
     * Formats and prints the menu items to the console in a readable table layout.
     * In a real web app, this data would be serialized to JSON and rendered
     * by a responsive frontend (HTML/CSS per CON-5).
     *
     * Only available items are displayed to the customer (out-of-stock items
     * are filtered out by the business layer via Menu.getAvailableItems()).
     *
     * @param result         The successful MenuResult containing the Menu object
     * @param restaurantName The name of the restaurant to display in the heading
     */
    private void displayMenu(MenuResult result, String restaurantName) {

        List<MenuItem> availableItems = result.getMenu().getAvailableItems();
        int totalItems = result.getMenu().getTotalItemCount();
        int availableCount = availableItems.size();

        // Summary line
        System.out.println(" Restaurant  : " + restaurantName);
        System.out.printf(" Items shown : %d available  (%d total on menu)%n",
                availableCount, totalItems);
        System.out.println();

        // Column headers
        System.out.printf(" %-4s  %-35s  %-8s  %s%n", "#", "Item Name", "Price", "Status");
        System.out.println(" " + "─".repeat(70));

        // Print each available item as a formatted row
        int index = 1;
        for (MenuItem item : availableItems) {
            System.out.printf(" %-4d  %-35s  %.3f BD  In Stock (%d left)%n",
                    index++,
                    item.getName(),
                    item.getPrice(),
                    item.getAvailableQuantity());

            // Print the item description indented below the item name
            System.out.printf("       → %s%n", item.getDescription());
            System.out.println();
        }

        // Footer prompt - simulates UI affordance to continue to UC-04 (Add to Cart)
        System.out.println(" " + "─".repeat(70));
        System.out.println(" [Select an item to add to your cart]   [← Back to Restaurants]");
        System.out.println();
    }

    /**
     * Displays a formatted error message to the user when the menu
     * cannot be loaded. Handles the UC-03 exception scenario:
     * "Menu unavailable → system shows message."
     *
     * @param message The error message returned by the business service
     */
    private void displayError(String message) {
        System.out.println();
        System.out.println(" ⚠  Menu Unavailable");
        System.out.println(" " + "─".repeat(50));
        System.out.println(" " + message);
        System.out.println();
        System.out.println(" [← Back to Restaurants]");
        System.out.println();
    }

    /**
     * Prints a formatted section header to visually separate output sections.
     * Simulates a page/screen transition in a console-based UI.
     *
     * @param title The title text to display in the header
     */
    private void printSectionHeader(String title) {
        System.out.println();
        System.out.println(" ╔══════════════════════════════════════════════════════════════╗");
        System.out.printf(" ║  %-62s║%n", title);
        System.out.println(" ╚══════════════════════════════════════════════════════════════╝");
        System.out.println();
    }
}
