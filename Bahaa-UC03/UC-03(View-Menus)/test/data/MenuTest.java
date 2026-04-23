package data;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

/**
 * ============================================================
 * OFOS - Online Food Ordering System
 * UC-03: View Menus
 * ============================================================
 *
 * TEST CLASS - MenuTest
 *
 * JUnit 5 test class for the Menu data entity.
 * Tests menu construction, item management, availability filtering,
 * and the edge cases relevant to UC-03 (e.g., all items out of stock).
 */
public class MenuTest {

    /** An empty menu used as a base for most tests */
    private Menu menu;

    /** An available item (quantity > 0) */
    private MenuItem availableItem;

    /** An out-of-stock item (quantity = 0) */
    private MenuItem unavailableItem;

    /**
     * Runs before each test.
     * Creates a fresh Menu and two MenuItem instances.
     */
    @BeforeEach
    void setUp() {
        menu = new Menu("M001", "R001");

        availableItem = new MenuItem(
                "I001", "M001", "Pepperoni Pizza",
                "Classic pizza", 4.5, 10);

        unavailableItem = new MenuItem(
                "I002", "M001", "Cheese Pasta",
                "Out of stock item", 2.5, 0);
    }

    // ───────────────────────────────────────────────
    // Constructor & getter tests
    // ───────────────────────────────────────────────

    /**
     * A newly created Menu should report the correct menuId.
     */
    @Test
    void testGetMenuId() {
        assertEquals("M001", menu.getMenuId(),
                "getMenuId() should return the ID given at construction");
    }

    /**
     * A newly created Menu should report the correct restaurantId.
     */
    @Test
    void testGetRestaurantId() {
        assertEquals("R001", menu.getRestaurantId(),
                "getRestaurantId() should return the restaurant ID given at construction");
    }

    /**
     * A brand-new Menu with no items should have a total count of 0.
     */
    @Test
    void testNewMenu_HasZeroItems() {
        assertEquals(0, menu.getTotalItemCount(),
                "A new menu should have 0 items");
    }

    // ───────────────────────────────────────────────
    // addItem() tests
    // ───────────────────────────────────────────────

    /**
     * After adding one item, the total count should be 1.
     */
    @Test
    void testAddItem_IncreasesCount() {
        menu.addItem(availableItem);
        assertEquals(1, menu.getTotalItemCount(),
                "Adding one item should make total count = 1");
    }

    /**
     * Adding a null item should be safely ignored (no crash, no count increase).
     */
    @Test
    void testAddItem_NullIsIgnored() {
        menu.addItem(null);
        assertEquals(0, menu.getTotalItemCount(),
                "Adding null should not increase the item count");
    }

    /**
     * Adding multiple items should correctly increase the count.
     */
    @Test
    void testAddItem_MultipleItems() {
        menu.addItem(availableItem);
        menu.addItem(unavailableItem);
        assertEquals(2, menu.getTotalItemCount(),
                "After adding 2 items, total count should be 2");
    }

    // ───────────────────────────────────────────────
    // getAvailableItems() tests
    // ───────────────────────────────────────────────

    /**
     * getAvailableItems() should only return items with quantity > 0.
     * This directly supports UC-03's requirement to show available items.
     */
    @Test
    void testGetAvailableItems_ExcludesOutOfStock() {
        menu.addItem(availableItem);
        menu.addItem(unavailableItem);

        List<MenuItem> available = menu.getAvailableItems();

        assertEquals(1, available.size(),
                "Only 1 item is in stock; available list should have size 1");
        assertEquals("I001", available.get(0).getItemId(),
                "The available item should be the one with quantity > 0");
    }

    /**
     * When all items are out of stock, getAvailableItems() should return empty list.
     * This is the UC-03 exception scenario.
     */
    @Test
    void testGetAvailableItems_AllOutOfStock_ReturnsEmpty() {
        menu.addItem(unavailableItem);
        List<MenuItem> available = menu.getAvailableItems();
        assertTrue(available.isEmpty(),
                "When all items are out of stock, available list should be empty");
    }

    // ───────────────────────────────────────────────
    // hasAvailableItems() tests
    // ───────────────────────────────────────────────

    /**
     * hasAvailableItems() should return true when at least one item is in stock.
     */
    @Test
    void testHasAvailableItems_WhenOneInStock_ReturnsTrue() {
        menu.addItem(availableItem);
        assertTrue(menu.hasAvailableItems(),
                "hasAvailableItems() should return true when one item is in stock");
    }

    /**
     * hasAvailableItems() should return false when all items are out of stock.
     * This is the condition that triggers the UC-03 "menu unavailable" message.
     */
    @Test
    void testHasAvailableItems_WhenAllOutOfStock_ReturnsFalse() {
        menu.addItem(unavailableItem);
        assertFalse(menu.hasAvailableItems(),
                "hasAvailableItems() should return false when all items are out of stock");
    }

    /**
     * hasAvailableItems() should return false on an empty menu.
     */
    @Test
    void testHasAvailableItems_EmptyMenu_ReturnsFalse() {
        assertFalse(menu.hasAvailableItems(),
                "hasAvailableItems() should return false on an empty menu");
    }

    // ───────────────────────────────────────────────
    // getItems() immutability test
    // ───────────────────────────────────────────────

    /**
     * getItems() should return an unmodifiable list.
     * External code must not be able to alter the menu's internal item list.
     */
    @Test
    void testGetItems_ReturnsUnmodifiableList() {
        menu.addItem(availableItem);
        assertThrows(UnsupportedOperationException.class, () -> {
            menu.getItems().add(unavailableItem);
        }, "getItems() should return an unmodifiable list");
    }
}
