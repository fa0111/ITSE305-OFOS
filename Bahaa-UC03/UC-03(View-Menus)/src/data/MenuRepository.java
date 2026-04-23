package data;

import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * OFOS - Online Food Ordering System
 * UC-03: View Menus
 * ============================================================
 *
 * DATA LAYER - MenuRepository
 *
 * Responsible for all data-access operations related to Menus.
 * In a production system, this class would use JDBC / Hibernate (ORM)
 * to query a relational database (e.g., PostgreSQL or MySQL) as described
 * in Phase 3, Table 3.8 (Repositories / DAOs).
 *
 * For this submission, the repository uses an in-memory HashMap to
 * simulate the database, pre-populated with realistic sample data
 * that mirrors the UC-03 scenario (Hassan views Pizza Hut's menu).
 *
 * Key method from Phase 3 Table 3.8:
 *   findMenuByRestaurant(UUID restaurantId): Menu
 *
 * Business rule enforced here:
 *   - A restaurant with no menu entries returns null (menu unavailable)
 */
public class MenuRepository {

    /**
     * Simulated in-memory "database" table.
     * Key   = restaurantId
     * Value = Menu object with all its MenuItems
     *
     * In production this would be replaced by:
     *   EntityManager em = ...; // Hibernate / JPA
     *   return em.createQuery("SELECT m FROM Menu m WHERE m.restaurantId = :id")
     *            .setParameter("id", restaurantId)
     *            .getSingleResult();
     */
    private final Map<String, Menu> menuDatabase;

    /**
     * Constructor - initialises the repository and loads sample data.
     * Called once when the application starts (via Dependency Injection
     * in a Spring context, or directly in standalone mode).
     */
    public MenuRepository() {
        menuDatabase = new HashMap<>();
        loadSampleData();
    }

    /**
     * Retrieves the Menu for a specific restaurant by its unique ID.
     * This is the primary data-access method for UC-03.
     *
     * Corresponds to:
     *   MenuRepository.findMenuByRestaurant(UUID restaurantId): Menu
     *   (Phase 3 - Table 3.8)
     *
     * @param restaurantId The unique ID of the restaurant whose menu is requested
     * @return The Menu object if found; null if the restaurant has no menu
     */
    public Menu findMenuByRestaurant(String restaurantId) {
        // In a real system: SELECT * FROM menus WHERE restaurant_id = ?
        return menuDatabase.get(restaurantId);
    }

    /**
     * Checks whether a restaurant has a registered menu in the system.
     * Used by the business layer before attempting to retrieve a menu.
     *
     * @param restaurantId The restaurant to check
     * @return true if a menu exists for the given restaurant, false otherwise
     */
    public boolean menuExistsForRestaurant(String restaurantId) {
        return menuDatabase.containsKey(restaurantId) &&
               menuDatabase.get(restaurantId) != null;
    }

    /**
     * Loads realistic sample data to simulate a populated database.
     *
     * Scenario based on UC-03 Use Case (S1):
     *   "Hassan selects Pizza Hut. The system displays Pizza Hut's menu
     *    with prices. He scrolls through available items."
     *
     * Three restaurants are seeded:
     *   1. Pizza Hut  (restaurantId = "R001")
     *   2. Burger Lab (restaurantId = "R002")
     *   3. Sushi Bay  (restaurantId = "R003") - menu unavailable scenario
     */
    private void loadSampleData() {

        // ─── Restaurant 1: Pizza Hut ──────────────────────────────────
        Menu pizzaHutMenu = new Menu("M001", "R001");

        pizzaHutMenu.addItem(new MenuItem(
                "I001", "M001",
                "Pepperoni Pizza (Large)",
                "Classic pizza topped with spicy pepperoni slices and mozzarella cheese",
                4.500, 15));

        pizzaHutMenu.addItem(new MenuItem(
                "I002", "M001",
                "Margherita Pizza (Medium)",
                "Tomato base, fresh mozzarella, and basil leaves on a thin crust",
                3.200, 20));

        pizzaHutMenu.addItem(new MenuItem(
                "I003", "M001",
                "BBQ Chicken Pizza (Large)",
                "Smoky BBQ sauce, grilled chicken strips, red onions, and cheddar cheese",
                4.800, 10));

        pizzaHutMenu.addItem(new MenuItem(
                "I004", "M001",
                "Garlic Bread",
                "Toasted baguette with garlic butter and herbs",
                1.200, 30));

        pizzaHutMenu.addItem(new MenuItem(
                "I005", "M001",
                "Cheese Pasta",
                "Creamy white sauce pasta with four types of cheese — currently unavailable",
                2.500, 0));  // Out of stock - tests exception scenario

        pizzaHutMenu.addItem(new MenuItem(
                "I006", "M001",
                "Soft Drink (Can)",
                "Choice of Pepsi, 7UP, or Miranda",
                0.400, 100));

        menuDatabase.put("R001", pizzaHutMenu);

        // ─── Restaurant 2: Burger Lab ─────────────────────────────────
        Menu burgerLabMenu = new Menu("M002", "R002");

        burgerLabMenu.addItem(new MenuItem(
                "I007", "M002",
                "Classic Smash Burger",
                "Double smashed beef patty, American cheese, pickles, and special sauce",
                3.900, 25));

        burgerLabMenu.addItem(new MenuItem(
                "I008", "M002",
                "Crispy Chicken Sandwich",
                "Fried chicken fillet, coleslaw, and sriracha mayo in a brioche bun",
                3.500, 18));

        burgerLabMenu.addItem(new MenuItem(
                "I009", "M002",
                "Truffle Fries",
                "Golden fries tossed in truffle oil and Parmesan cheese",
                1.800, 40));

        menuDatabase.put("R002", burgerLabMenu);

        // ─── Restaurant 3: Sushi Bay (no available items) ─────────────
        // This simulates the UC-03 exception: "Menu unavailable → system shows message"
        Menu sushiBayMenu = new Menu("M003", "R003");
        sushiBayMenu.addItem(new MenuItem(
                "I010", "M003",
                "Salmon Nigiri",
                "Fresh Atlantic salmon on seasoned rice",
                5.500, 0));  // All items out of stock
        menuDatabase.put("R003", sushiBayMenu);
    }
}
