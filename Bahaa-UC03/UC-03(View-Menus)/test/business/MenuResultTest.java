package business;

import data.Menu;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * ============================================================
 * OFOS - Online Food Ordering System
 * UC-03: View Menus
 * ============================================================
 *
 * TEST CLASS - MenuResultTest
 *
 * JUnit 5 test class for the MenuResult DTO (Data Transfer Object).
 * Tests both the success and failure factory methods, and verifies
 * that the correct fields are set in each case.
 */
public class MenuResultTest {

    // ───────────────────────────────────────────────
    // success() factory method tests
    // ───────────────────────────────────────────────

    /**
     * MenuResult.success() should set isSuccess() to true.
     */
    @Test
    void testSuccess_IsSuccessReturnsTrue() {
        Menu menu = new Menu("M001", "R001");
        MenuResult result = MenuResult.success(menu);
        assertTrue(result.isSuccess(),
                "isSuccess() should return true for a success result");
    }

    /**
     * MenuResult.success() should store the provided Menu.
     */
    @Test
    void testSuccess_GetMenuReturnsMenu() {
        Menu menu = new Menu("M001", "R001");
        MenuResult result = MenuResult.success(menu);
        assertSame(menu, result.getMenu(),
                "getMenu() should return the exact same Menu object passed to success()");
    }

    /**
     * A success result should have a null error message.
     */
    @Test
    void testSuccess_ErrorMessageIsNull() {
        Menu menu = new Menu("M001", "R001");
        MenuResult result = MenuResult.success(menu);
        assertNull(result.getErrorMessage(),
                "A success result should have a null error message");
    }

    // ───────────────────────────────────────────────
    // failure() factory method tests
    // ───────────────────────────────────────────────

    /**
     * MenuResult.failure() should set isSuccess() to false.
     */
    @Test
    void testFailure_IsSuccessReturnsFalse() {
        MenuResult result = MenuResult.failure("Menu unavailable");
        assertFalse(result.isSuccess(),
                "isSuccess() should return false for a failure result");
    }

    /**
     * MenuResult.failure() should store the provided error message.
     */
    @Test
    void testFailure_GetErrorMessageReturnsMessage() {
        String errorMsg = "Menu is currently unavailable";
        MenuResult result = MenuResult.failure(errorMsg);
        assertEquals(errorMsg, result.getErrorMessage(),
                "getErrorMessage() should return the message passed to failure()");
    }

    /**
     * A failure result should have a null Menu object.
     */
    @Test
    void testFailure_GetMenuIsNull() {
        MenuResult result = MenuResult.failure("Menu unavailable");
        assertNull(result.getMenu(),
                "A failure result should have a null Menu");
    }
}
