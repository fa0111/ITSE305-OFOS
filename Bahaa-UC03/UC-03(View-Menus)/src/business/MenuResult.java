package business;

import data.Menu;

/**
 * ============================================================
 * OFOS - Online Food Ordering System
 * UC-03: View Menus
 * ============================================================
 *
 * BUSINESS LAYER - MenuResult (Data Transfer Object)
 *
 * A simple DTO (Data Transfer Object) that encapsulates the outcome
 * of a menu retrieval operation performed by MenuService.
 *
 * This pattern decouples the business layer's response from raw
 * data entities, and cleanly communicates both success and failure
 * states to the Presentation layer without throwing exceptions.
 *
 * Fields:
 *   success      - true if a valid, available menu was found
 *   menu         - the retrieved Menu object (null on failure)
 *   errorMessage - human-readable reason for failure (null on success)
 *
 * Usage in MenuController (Presentation layer):
 *   MenuResult result = menuService.getMenuForRestaurant(restaurantId);
 *   if (result.isSuccess()) { display(result.getMenu()); }
 *   else                    { showError(result.getErrorMessage()); }
 */
public class MenuResult {

    /** Indicates whether the menu retrieval was successful */
    private final boolean success;

    /** The retrieved Menu object; null if retrieval failed */
    private final Menu menu;

    /**
     * Human-readable error message explaining why retrieval failed.
     * Null if retrieval was successful.
     */
    private final String errorMessage;

    /**
     * Private constructor - use the static factory methods below
     * to create instances, ensuring valid state.
     *
     * @param success      Whether the operation succeeded
     * @param menu         The Menu (or null on failure)
     * @param errorMessage The error message (or null on success)
     */
    private MenuResult(boolean success, Menu menu, String errorMessage) {
        this.success      = success;
        this.menu         = menu;
        this.errorMessage = errorMessage;
    }

    /**
     * Factory method: creates a successful MenuResult containing the menu.
     *
     * @param menu The successfully retrieved and validated Menu
     * @return A MenuResult representing a successful operation
     */
    public static MenuResult success(Menu menu) {
        return new MenuResult(true, menu, null);
    }

    /**
     * Factory method: creates a failed MenuResult with an error message.
     * Used when the menu is unavailable or the restaurant ID is invalid.
     *
     * @param errorMessage Description of why the menu could not be retrieved
     * @return A MenuResult representing a failed operation
     */
    public static MenuResult failure(String errorMessage) {
        return new MenuResult(false, null, errorMessage);
    }

    /**
     * @return true if the menu was successfully retrieved and is available
     */
    public boolean isSuccess() { return success; }

    /**
     * @return The Menu object (only valid when isSuccess() == true)
     */
    public Menu getMenu() { return menu; }

    /**
     * @return The error message explaining the failure (only valid when isSuccess() == false)
     */
    public String getErrorMessage() { return errorMessage; }
}
