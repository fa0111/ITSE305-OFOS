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
 * TEST CLASS - MenuRepositoryTest
 *
 * JUnit 5 test class for the MenuRepository data-access class.
 * Tests the data retrieval methods that simulate database queries.
 *
 * Tests cover:
 *   - Finding a menu by a valid restaurant ID
 *   - Handling an invalid / unknown restaurant ID
 *   - Checking menu existence
 *   - Verifying sample data is correctly loaded
 */
public class MenuRepositoryTest {

    /**
     * The repository instance shared across all tests.
     * Re-created before each test to ensure a clean state.
     */
    private MenuRepository repository;

    /**
     * Runs before each test — creates a fresh repository
     * with the pre-loaded sample data.
     */
    @BeforeEach
    void setUp() {
        repository = new MenuRepository();
    }

    // ───────────────────────────────────────────────
    // findMenuByRestaurant() tests
    // ───────────────────────────────────────────────

    /**
     * A valid restaurant ID ("R001" = Pizza Hut) should return a non-null Menu.
     */
    @Test
    void testFindMenuByRestaurant_ValidId_ReturnsMenu() {
        Menu menu = repository.findMenuByRestaurant("R001");
        assertNotNull(menu,
                "findMenuByRestaurant() should return a Menu for a valid restaurant ID");
    }

    /**
     * The returned menu should belong to the requested restaurant.
     */
    @Test
    void testFindMenuByRestaurant_ReturnsCorrectRestaurantId() {
        Menu menu = repository.findMenuByRestaurant("R001");
        assertEquals("R001", menu.getRestaurantId(),
                "The returned menu's restaurantId should match the requested ID");
    }

    /**
     * An unknown restaurant ID should return null (no menu found).
     * This simulates the UC-03 exception: "Menu unavailable".
     */
    @Test
    void testFindMenuByRestaurant_InvalidId_ReturnsNull() {
        Menu menu = repository.findMenuByRestaurant("R999");
        assertNull(menu,
                "findMenuByRestaurant() should return null for an unknown restaurant ID");
    }

    /**
     * A null restaurant ID should return null gracefully without throwing.
     */
    @Test
    void testFindMenuByRestaurant_NullId_ReturnsNull() {
        Menu menu = repository.findMenuByRestaurant(null);
        assertNull(menu,
                "findMenuByRestaurant() should return null for a null ID");
    }

    // ───────────────────────────────────────────────
    // menuExistsForRestaurant() tests
    // ───────────────────────────────────────────────

    /**
     * menuExistsForRestaurant() should return true for a known restaurant.
     */
    @Test
    void testMenuExistsForRestaurant_ValidId_ReturnsTrue() {
        assertTrue(repository.menuExistsForRestaurant("R001"),
                "menuExistsForRestaurant() should return true for a known restaurant");
    }

    /**
     * menuExistsForRestaurant() should return false for an unknown restaurant.
     */
    @Test
    void testMenuExistsForRestaurant_InvalidId_ReturnsFalse() {
        assertFalse(repository.menuExistsForRestaurant("R999"),
                "menuExistsForRestaurant() should return false for an unknown restaurant");
    }

    // ───────────────────────────────────────────────
    // Sample data integrity tests
    // ───────────────────────────────────────────────

    /**
     * Pizza Hut's menu (R001) should contain items as per the sample data.
     */
    @Test
    void testPizzaHutMenu_HasItems() {
        Menu menu = repository.findMenuByRestaurant("R001");
        assertTrue(menu.getTotalItemCount() > 0,
                "Pizza Hut's menu should have at least one item loaded");
    }

    /**
     * Pizza Hut's menu should have at least one available item.
     */
    @Test
    void testPizzaHutMenu_HasAvailableItems() {
        Menu menu = repository.findMenuByRestaurant("R001");
        assertTrue(menu.hasAvailableItems(),
                "Pizza Hut's menu should have at least one available item");
    }

    /**
     * Sushi Bay (R003) is the exception scenario — all items out of stock.
     * The menu exists but hasAvailableItems() should return false.
     */
    @Test
    void testSushiBayMenu_ExistsButNoAvailableItems() {
        assertTrue(repository.menuExistsForRestaurant("R003"),
                "Sushi Bay menu should exist in the repository");

        Menu menu = repository.findMenuByRestaurant("R003");
        assertFalse(menu.hasAvailableItems(),
                "Sushi Bay menu should have no available items (UC-03 exception scenario)");
    }

    /**
     * Burger Lab's menu (R002) should exist and be available.
     */
    @Test
    void testBurgerLabMenu_ExistsAndAvailable() {
        Menu menu = repository.findMenuByRestaurant("R002");
        assertNotNull(menu, "Burger Lab menu should exist");
        assertTrue(menu.hasAvailableItems(), "Burger Lab menu should have available items");
    }
}
