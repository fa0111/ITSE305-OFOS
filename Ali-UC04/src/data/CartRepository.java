package data;

import java.util.HashMap;
import java.util.Map;

/**
 * Data Layer - CartRepository
 * Simulates a database for storing cart items.
 */
public class CartRepository {

    // key = item name, value = quantity
    private Map<String, Integer> cartData = new HashMap<>();

    /**
     * Adds or updates an item in the cart.
     */
    public void addItem(String item, int qty) {
        cartData.put(item, cartData.getOrDefault(item, 0) + qty);
    }

    /**
     * Returns a copy of the current cart.
     */
    public Map<String, Integer> getCart() {
        return new HashMap<>(cartData);
    }

    /**
     * Clears all items from the cart.
     */
    public void clearCart() {
        cartData.clear();
    }

    /**
     * Checks if the cart is empty.
     */
    public boolean isEmpty() {
        return cartData.isEmpty();
    }
}