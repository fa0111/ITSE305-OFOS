package data;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * ============================================================
 * OFOS - Online Food Ordering System
 * UC-03: View Menus
 * ============================================================
 *
 * TEST CLASS - MenuItemTest
 *
 * JUnit 5 test class for the MenuItem data entity.
 * Tests all methods and edge cases of the MenuItem class.
 *
 * Each test method follows the AAA pattern:
 *   Arrange  - set up the test data
 *   Act      - call the method being tested
 *   Assert   - verify the result is correct
 */
public class MenuItemTest {

    /** A standard in-stock menu item reused across multiple tests */
    private MenuItem inStockItem;

    /** A menu item with zero quantity (out of stock) */
    private MenuItem outOfStockItem;

    /**
     * Runs before EACH test method.
     * Creates fresh MenuItem instances so tests don't affect each other.
     */
    @BeforeEach
    void setUp() {
        inStockItem = new MenuItem(
                "I001", "M001",
                "Pepperoni Pizza",
                "Classic pizza with pepperoni",
                4.500, 15);

        outOfStockItem = new MenuItem(
                "I002", "M001",
                "Cheese Pasta",
                "Creamy four-cheese pasta",
                2.500, 0);
    }

    // ───────────────────────────────────────────────
    // Tests for getters
    // ───────────────────────────────────────────────

    /**
     * Verifies that getItemId() returns the correct ID passed to constructor.
     */
    @Test
    void testGetItemId() {
        assertEquals("I001", inStockItem.getItemId(),
                "getItemId() should return the ID given in the constructor");
    }

    /**
     * Verifies that getMenuId() returns the correct menu ID.
     */
    @Test
    void testGetMenuId() {
        assertEquals("M001", inStockItem.getMenuId(),
                "getMenuId() should return the menu ID given in the constructor");
    }

    /**
     * Verifies that getName() returns the correct item name.
     */
    @Test
    void testGetName() {
        assertEquals("Pepperoni Pizza", inStockItem.getName(),
                "getName() should return the name given in the constructor");
    }

    /**
     * Verifies that getDescription() returns the correct description.
     */
    @Test
    void testGetDescription() {
        assertEquals("Classic pizza with pepperoni", inStockItem.getDescription(),
                "getDescription() should return the description given in the constructor");
    }

    /**
     * Verifies that getPrice() returns the correct price value.
     * Uses a delta of 0.001 for floating-point comparison.
     */
    @Test
    void testGetPrice() {
        assertEquals(4.500, inStockItem.getPrice(), 0.001,
                "getPrice() should return the exact price given in the constructor");
    }

    /**
     * Verifies that getAvailableQuantity() returns the correct quantity.
     */
    @Test
    void testGetAvailableQuantity() {
        assertEquals(15, inStockItem.getAvailableQuantity(),
                "getAvailableQuantity() should return the quantity given in the constructor");
    }

    // ───────────────────────────────────────────────
    // Tests for isAvailable()
    // ───────────────────────────────────────────────

    /**
     * An item with quantity > 0 should be considered available.
     * This is used in UC-03 to show only orderable items.
     */
    @Test
    void testIsAvailable_WhenInStock_ReturnsTrue() {
        assertTrue(inStockItem.isAvailable(),
                "isAvailable() should return true when quantity > 0");
    }

    /**
     * An item with quantity = 0 should NOT be available.
     * UC-03 exception: items with 0 quantity are hidden from the menu display.
     */
    @Test
    void testIsAvailable_WhenOutOfStock_ReturnsFalse() {
        assertFalse(outOfStockItem.isAvailable(),
                "isAvailable() should return false when quantity = 0");
    }

    /**
     * An item with exactly 1 unit remaining should still be available.
     */
    @Test
    void testIsAvailable_WithOneUnit_ReturnsTrue() {
        MenuItem oneLeft = new MenuItem("I003", "M001", "Last Slice", "One left", 1.0, 1);
        assertTrue(oneLeft.isAvailable(),
                "isAvailable() should return true when exactly 1 unit remains");
    }

    // ───────────────────────────────────────────────
    // Tests for toString()
    // ───────────────────────────────────────────────

    /**
     * Verifies that toString() includes the item's key fields.
     * Useful for confirming log output contains readable info.
     */
    @Test
    void testToString_ContainsItemId() {
        String result = inStockItem.toString();
        assertTrue(result.contains("I001"),
                "toString() should contain the itemId");
    }

    /**
     * Verifies toString() includes the item name.
     */
    @Test
    void testToString_ContainsName() {
        String result = inStockItem.toString();
        assertTrue(result.contains("Pepperoni Pizza"),
                "toString() should contain the item name");
    }
}
