import data.MenuRepository;
import business.MenuService;
import presentation.MenuController;

/**
 * ============================================================
 * OFOS - Online Food Ordering System
 * UC-03: View Menus
 * ============================================================
 *
 * MAIN - Application Entry Point
 *
 * This class wires together all three architectural layers and
 * runs the UC-03 "View Menus" use case scenarios.
 *
 * Three-Tier Architecture (Phase 3 - Step 4):
 *   ┌─────────────────────────────────────┐
 *   │  PRESENTATION LAYER                 │  MenuController
 *   │  (handles UI events & display)      │
 *   ├─────────────────────────────────────┤
 *   │  BUSINESS LOGIC LAYER               │  MenuService + MenuResult
 *   │  (enforces UC-03 business rules)    │
 *   ├─────────────────────────────────────┤
 *   │  DATA ACCESS LAYER                  │  MenuRepository + Menu + MenuItem
 *   │  (simulates DB: menus & items)      │
 *   └─────────────────────────────────────┘
 *
 * Scenarios demonstrated:
 *   S1 - SUCCESS:    Hassan views Pizza Hut's menu (main success flow)
 *   S2 - SUCCESS:    Viewing Burger Lab menu (second restaurant)
 *   S3 - EXCEPTION:  Sushi Bay — all items out of stock
 *   S4 - EXCEPTION:  Invalid restaurant ID — no menu exists
 */
public class Main {

    /**
     * Application entry point.
     * Demonstrates all UC-03 scenarios by calling the full three-layer stack.
     *
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {

        System.out.println("=================================================================");
        System.out.println("  OFOS - Online Food Ordering System");
        System.out.println("  UC-03: View Menus  |  Three-Layer Architecture Demo");
        System.out.println("=================================================================");

        // ─── Dependency Wiring (Manual DI) ────────────────────────────
        // In Spring this would be handled by @Autowired / @Bean annotations.
        // Here we manually construct the layers and inject dependencies.

        // 1. Data Layer: repository simulates database access
        MenuRepository menuRepository = new MenuRepository();

        // 2. Business Layer: service receives the repository (DI)
        MenuService menuService = new MenuService(menuRepository);

        // 3. Presentation Layer: controller receives the service (DI)
        MenuController menuController = new MenuController(menuService);

        // ─── SCENARIO 1: Success Path ──────────────────────────────────
        // UC-03 (S1): "Hassan selects 'Pizza Hut'. The system displays
        //              Pizza Hut's menu with prices."
        System.out.println("\n>>> SCENARIO 1: Customer views Pizza Hut menu (Success)");
        menuController.viewMenu("R001", "Pizza Hut");

        // ─── SCENARIO 2: Second restaurant ────────────────────────────
        // Customer browses another restaurant's menu
        System.out.println(">>> SCENARIO 2: Customer views Burger Lab menu (Success)");
        menuController.viewMenu("R002", "Burger Lab");

        // ─── SCENARIO 3: Exception - All items out of stock ───────────
        // UC-03 Exception: "Menu unavailable → system shows message"
        // Sushi Bay exists but all its items have quantity = 0
        System.out.println(">>> SCENARIO 3: Sushi Bay - all items out of stock (Exception)");
        menuController.viewMenu("R003", "Sushi Bay");

        // ─── SCENARIO 4: Exception - Restaurant not found ─────────────
        // UC-03 Exception: restaurant ID does not exist in the system
        System.out.println(">>> SCENARIO 4: Invalid restaurant ID (Exception)");
        menuController.viewMenu("R999", "Unknown Restaurant");

        System.out.println("=================================================================");
        System.out.println("  UC-03 demonstration complete.");
        System.out.println("=================================================================");
    }
}
