package data;

/**
 * ============================================================
 * OFOS - Online Food Ordering System
 * UC-03: View Menus
 * ============================================================
 *
 * DATA LAYER - MenuItem Entity
 *
 * Represents a single food item that belongs to a restaurant's menu.
 * This entity maps directly to a record in the "menu_items" database table.
 *
 * Attributes are based on the domain model defined in Phase 3 (Table 3.4):
 *   itemId, menuId, name, description, price, availableQuantity
 *
 * Actor:        Customer / Guest
 * Precondition: A restaurant has been selected (from UC-02)
 * Postcondition: Menu item data is available to be displayed
 */
public class MenuItem {

    /** Unique identifier for this menu item (UUID as String) */
    private String itemId;

    /** The ID of the menu this item belongs to */
    private String menuId;

    /** Display name of the food item (e.g., "Pepperoni Pizza") */
    private String name;

    /** Short description of the item (ingredients, preparation style, etc.) */
    private String description;

    /** Price of the item in BHD (Bahraini Dinar) */
    private double price;

    /** How many units are currently available; 0 means out of stock */
    private int availableQuantity;

    /**
     * Constructs a fully-populated MenuItem object.
     *
     * @param itemId            Unique identifier for the item
     * @param menuId            ID of the parent menu
     * @param name              Name of the dish/item
     * @param description       Short description of the item
     * @param price             Price in BHD
     * @param availableQuantity Current stock quantity
     */
    public MenuItem(String itemId, String menuId, String name,
                    String description, double price, int availableQuantity) {
        this.itemId            = itemId;
        this.menuId            = menuId;
        this.name              = name;
        this.description       = description;
        this.price             = price;
        this.availableQuantity = availableQuantity;
    }

    // ---------------------------------------------------------------
    // Getters - used by the Business and Presentation layers to read
    // item data without exposing internal state directly.
    // ---------------------------------------------------------------

    /** @return The unique ID of this menu item */
    public String getItemId() { return itemId; }

    /** @return The menu ID this item belongs to */
    public String getMenuId() { return menuId; }

    /** @return The display name of this item */
    public String getName() { return name; }

    /** @return A short description of this item */
    public String getDescription() { return description; }

    /** @return The price of this item in BHD */
    public double getPrice() { return price; }

    /** @return Available quantity in stock (0 = out of stock) */
    public int getAvailableQuantity() { return availableQuantity; }

    /**
     * Checks whether this item is currently in stock and can be ordered.
     *
     * @return true if availableQuantity > 0, false otherwise
     */
    public boolean isAvailable() {
        return availableQuantity > 0;
    }

    /**
     * Returns a formatted string representation of the MenuItem,
     * useful for logging and debugging.
     *
     * @return Human-readable summary of the item
     */
    @Override
    public String toString() {
        return String.format("MenuItem{id='%s', name='%s', price=%.3f BHD, qty=%d}",
                itemId, name, price, availableQuantity);
    }
}
