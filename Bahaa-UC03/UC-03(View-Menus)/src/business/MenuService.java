package business;

import data.Menu;
import data.MenuRepository;

/**
 * ============================================================
 * OFOS - Online Food Ordering System
 * UC-03: View Menus
 * ============================================================
 *
 * BUSINESS LAYER - MenuService
 *
 * This class implements the core business logic for UC-03: View Menus.
 * It sits between the Presentation layer (MenuController) and the
 * Data layer (MenuRepository), enforcing business rules and handling
 * the exception scenarios defined in the use case.
 *
 * Responsibilities (from Phase 3, Table 3.5 - Restaurant/Menu Module):
 *   - Validate that a restaurant ID is provided and non-empty
 *   - Retrieve the menu through the data repository
 *   - Enforce the UC-03 exception: "Menu unavailable → system shows message"
 *   - Return a MenuResult DTO containing the menu or an error message
 *
 * UC-03 Flow this service implements:
 *   1. User selects a restaurant  → restaurantId received
 *   2. System retrieves menu      → calls MenuRepository
 *   3. Exception check            → no items? return unavailable result
 *   4. Return menu data           → passes back to Presentation layer
 */
public class MenuService {

    /**
     * The data-access object for menu data.
     * In a Spring application this would be injected via @Autowired.
     * Here it is passed through the constructor (manual DI).
     */
    private final MenuRepository menuRepository;

    /**
     * Constructor injection of the MenuRepository.
     * This follows the Dependency Injection principle from Phase 3 (Step 4),
     * making the service testable and decoupled from the data layer.
     *
     * @param menuRepository The repository that handles menu data access
     */
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    /**
     * Core method for UC-03: retrieves and validates the menu for a restaurant.
     *
     * Business rules applied:
     *   BR1 - restaurantId must not be null or blank
     *   BR2 - A menu must exist for the given restaurant
     *   BR3 - The menu must contain at least one available item
     *          (if all items are out of stock → "menu unavailable" exception)
     *
     * @param restaurantId The unique ID of the restaurant selected by the user
     * @return MenuResult containing the Menu on success, or an error message on failure
     */
    public MenuResult getMenuForRestaurant(String restaurantId) {

        // BR1 - Validate input: restaurantId must not be null or empty
        if (restaurantId == null || restaurantId.trim().isEmpty()) {
            return MenuResult.failure("No restaurant selected. Please select a restaurant first.");
        }

        // BR2 - Check if a menu exists for this restaurant in the system
        if (!menuRepository.menuExistsForRestaurant(restaurantId)) {
            // UC-03 Exception: "Menu unavailable → system shows message"
            return MenuResult.failure(
                    "Menu is currently unavailable for the selected restaurant. " +
                    "Please try again later or choose a different restaurant.");
        }

        // Retrieve the menu from the data layer
        Menu menu = menuRepository.findMenuByRestaurant(restaurantId);

        // BR3 - Verify the menu has at least one available item
        if (!menu.hasAvailableItems()) {
            // UC-03 Exception: All items are out of stock
            return MenuResult.failure(
                    "All items on this restaurant's menu are currently out of stock. " +
                    "Please check back later.");
        }

        // Success: return the menu with available items to the presentation layer
        return MenuResult.success(menu);
    }
}
