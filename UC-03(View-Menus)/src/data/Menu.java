package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ============================================================
 * OFOS - Online Food Ordering System
 * UC-03: View Menus
 * ============================================================
 *
 * DATA LAYER - Menu Entity
 *
 * Represents the full menu of a restaurant, containing a collection
 * of MenuItem objects. One restaurant has exactly one Menu.
 *
 * Domain model reference (Phase 3, Table 3.4):
 *   Menu: menuId, restaurantId, items (collection of MenuItem)
 *
 * Actor:        Customer / Guest
 * Precondition: Restaurant exists and has at least one menu item
 * Postcondition: Menu object is populated and ready to be served
 */
public class Menu {

    /** Unique identifier for this menu */
    private String menuId;

    /** The restaurant this menu belongs to */
    private String restaurantId;

    /** The collection of food items on this menu */
    private List<MenuItem> items;

    /**
     * Constructs an empty Menu for a given restaurant.
     * Items can be added later using addItem().
     *
     * @param menuId       Unique ID of this menu
     * @param restaurantId The owning restaurant's ID
     */
    public Menu(String menuId, String restaurantId) {
        this.menuId       = menuId;
        this.restaurantId = restaurantId;
        this.items        = new ArrayList<>();
    }

    /**
     * Adds a single MenuItem to this menu.
     * Used by the MenuRepository when loading data from storage.
     *
     * @param item The MenuItem to add; ignored if null
     */
    public void addItem(MenuItem item) {
        if (item != null) {
            this.items.add(item);
        }
    }

    /**
     * Returns an unmodifiable view of the menu items list.
     * Prevents external code from modifying the internal list directly,
     * preserving encapsulation.
     *
     * @return Read-only list of MenuItems
     */
    public List<MenuItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    /**
     * Filters and returns only the items that are currently available
     * (i.e., availableQuantity > 0). Useful when displaying the menu
     * to a customer so they don't see out-of-stock items.
     *
     * @return List of available MenuItems; empty list if none available
     */
    public List<MenuItem> getAvailableItems() {
        List<MenuItem> available = new ArrayList<>();
        for (MenuItem item : items) {
            if (item.isAvailable()) {
                available.add(item);
            }
        }
        return available;
    }

    /**
     * Returns the total number of items on this menu (including unavailable).
     *
     * @return Total item count
     */
    public int getTotalItemCount() {
        return items.size();
    }

    /**
     * Checks whether this menu has at least one available item.
     * Used by the business layer to handle the "menu unavailable" exception
     * from UC-03.
     *
     * @return true if at least one item is available, false otherwise
     */
    public boolean hasAvailableItems() {
        for (MenuItem item : items) {
            if (item.isAvailable()) return true;
        }
        return false;
    }

    /** @return The unique ID of this menu */
    public String getMenuId() { return menuId; }

    /** @return The restaurant ID that owns this menu */
    public String getRestaurantId() { return restaurantId; }

    /**
     * Returns a formatted string summary of the Menu object.
     *
     * @return Human-readable summary
     */
    @Override
    public String toString() {
        return String.format("Menu{menuId='%s', restaurantId='%s', totalItems=%d}",
                menuId, restaurantId, items.size());
    }
}
