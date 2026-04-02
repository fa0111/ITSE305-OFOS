package business;

import data.MenuRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * ============================================================
 * OFOS - Online Food Ordering System
 * UC-03: View Menus
 * ============================================================
 *
 * TEST CLASS - MenuServiceTest
 *
 * JUnit 5 test class for the MenuService business logic class.
 * This is the most important test class as it verifies all
 * business rules (BR1-BR3) and both the success and exception
 * scenarios from UC-03.
 *
 * UC-03 scenarios tested:
 *   ✔ S1  - Valid restaurant with available items  → success
 *   ✔ EX1 - Null restaurant ID                    → failure
 *   ✔ EX2 - Empty restaurant ID                   → failure
 *   ✔ EX3 - Unknown restaurant ID (no menu)       → failure
 *   ✔ EX4 - Restaurant exists but all out of stock → failure
 */
public class MenuServiceTest {

    /** The service being tested */
    private MenuService menuService;

    /**
     * Runs before each test.
     * Wires the real MenuRepository into the MenuService
     * (using the pre-loaded sample data).
     */
    @BeforeEach
    void setUp() {
        MenuRepository repository = new MenuRepository();
        menuService = new MenuService(repository);
    }

    // ───────────────────────────────────────────────
    // Success scenario tests
    // ───────────────────────────────────────────────

    /**
     * UC-03 (S1): Hassan selects "Pizza Hut" (R001).
     * The service should return a successful result with a non-null menu.
     */
    @Test
    void testGetMenu_ValidRestaurant_ReturnsSuccess() {
        MenuResult result = menuService.getMenuForRestaurant("R001");
        assertTrue(result.isSuccess(),
                "A valid restaurant with available items should return a success result");
    }

    /**
     * The menu returned on success should not be null.
     */
    @Test
    void testGetMenu_ValidRestaurant_MenuIsNotNull() {
        MenuResult result = menuService.getMenuForRestaurant("R001");
        assertNotNull(result.getMenu(),
                "The menu in a success result should not be null");
    }

    /**
     * The menu returned should belong to the requested restaurant.
     */
    @Test
    void testGetMenu_ValidRestaurant_CorrectRestaurantId() {
        MenuResult result = menuService.getMenuForRestaurant("R001");
        assertEquals("R001", result.getMenu().getRestaurantId(),
                "The returned menu should belong to restaurant R001");
    }

    /**
     * The success result should have available items to display.
     */
    @Test
    void testGetMenu_ValidRestaurant_HasAvailableItems() {
        MenuResult result = menuService.getMenuForRestaurant("R001");
        assertFalse(result.getMenu().getAvailableItems().isEmpty(),
                "A successful menu result should contain at least one available item");
    }

    /**
     * Burger Lab (R002) should also return a successful result.
     */
    @Test
    void testGetMenu_BurgerLab_ReturnsSuccess() {
        MenuResult result = menuService.getMenuForRestaurant("R002");
        assertTrue(result.isSuccess(),
                "Burger Lab (R002) should return a success result");
    }

    // ───────────────────────────────────────────────
    // BR1: Null and blank restaurantId tests
    // ───────────────────────────────────────────────

    /**
     * BR1: A null restaurantId should return a failure result.
     */
    @Test
    void testGetMenu_NullId_ReturnsFailure() {
        MenuResult result = menuService.getMenuForRestaurant(null);
        assertFalse(result.isSuccess(),
                "A null restaurant ID should return a failure result");
    }

    /**
     * BR1: A null restaurantId failure should include an error message.
     */
    @Test
    void testGetMenu_NullId_HasErrorMessage() {
        MenuResult result = menuService.getMenuForRestaurant(null);
        assertNotNull(result.getErrorMessage(),
                "A null restaurant ID failure should include an error message");
    }

    /**
     * BR1: An empty string restaurantId should return a failure result.
     */
    @Test
    void testGetMenu_EmptyId_ReturnsFailure() {
        MenuResult result = menuService.getMenuForRestaurant("   ");
        assertFalse(result.isSuccess(),
                "A blank restaurant ID should return a failure result");
    }

    // ───────────────────────────────────────────────
    // BR2: Unknown restaurant ID tests
    // ───────────────────────────────────────────────

    /**
     * BR2: An unknown restaurant ID (no menu in DB) should return failure.
     * UC-03 exception: "Menu unavailable → system shows message."
     */
    @Test
    void testGetMenu_UnknownId_ReturnsFailure() {
        MenuResult result = menuService.getMenuForRestaurant("R999");
        assertFalse(result.isSuccess(),
                "An unknown restaurant ID should return a failure result");
    }

    /**
     * BR2: The failure for an unknown ID should include an error message.
     */
    @Test
    void testGetMenu_UnknownId_HasErrorMessage() {
        MenuResult result = menuService.getMenuForRestaurant("R999");
        assertNotNull(result.getErrorMessage(),
                "Failure for unknown restaurant should have an error message");
        assertFalse(result.getErrorMessage().isEmpty(),
                "The error message should not be empty");
    }

    // ───────────────────────────────────────────────
    // BR3: All items out of stock (Sushi Bay = R003)
    // ───────────────────────────────────────────────

    /**
     * BR3: Sushi Bay (R003) has a menu but all items are out of stock.
     * The service should return failure (UC-03 exception scenario).
     */
    @Test
    void testGetMenu_AllItemsOutOfStock_ReturnsFailure() {
        MenuResult result = menuService.getMenuForRestaurant("R003");
        assertFalse(result.isSuccess(),
                "A restaurant with all items out of stock should return failure");
    }

    /**
     * BR3: The failure message for out-of-stock scenario should not be null.
     */
    @Test
    void testGetMenu_AllItemsOutOfStock_HasErrorMessage() {
        MenuResult result = menuService.getMenuForRestaurant("R003");
        assertNotNull(result.getErrorMessage(),
                "Out-of-stock failure should include an error message");
    }

    /**
     * BR3: The menu should be null in the failure result (no menu to show).
     */
    @Test
    void testGetMenu_AllItemsOutOfStock_MenuIsNull() {
        MenuResult result = menuService.getMenuForRestaurant("R003");
        assertNull(result.getMenu(),
                "The menu in a failure result should be null");
    }
}
