package presentation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import business.AuthService;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Presentation Layer - AuthUI.
 * Since AuthUI handles console input/output, we test it
 * indirectly by verifying the AuthService it depends on
 * behaves correctly when called from the presentation layer.
 */
class AuthUITest {

    // We test the service that AuthUI depends on
    private AuthService authService;

    /**
     * This runs before each test.
     * Creates a fresh AuthService instance.
     */
    @BeforeEach
    void setUp() {
        authService = new AuthService();
    }

    /**
     * Test: verifying that the AuthService used by AuthUI
     * correctly handles a full registration flow.
     * Expected: SUCCESS message returned.
     */
    @Test
    void testAuthUIRegistrationFlow() {
        String result = authService.register(
                "fatima@example.com", "securepass", "Customer");
        assertTrue(result.startsWith("SUCCESS"),
                "AuthUI registration flow should produce a SUCCESS message.");
    }

    /**
     * Test: verifying that the AuthService used by AuthUI
     * correctly handles a full login flow after registration.
     * Expected: SUCCESS message returned.
     */
    @Test
    void testAuthUILoginFlow() {
        authService.register(
                "fatima@example.com", "securepass", "Customer");
        String result = authService.login(
                "fatima@example.com", "securepass");
        assertTrue(result.startsWith("SUCCESS"),
                "AuthUI login flow should produce a SUCCESS message.");
    }

    /**
     * Test: verifying that AuthUI's service handles
     * invalid login input correctly.
     * Expected: ERROR message returned.
     */
    @Test
    void testAuthUIInvalidLoginFlow() {
        String result = authService.login("", "");
        assertTrue(result.startsWith("ERROR"),
                "AuthUI should handle empty credentials with an ERROR message.");
    }

    /**
     * Test: verifying the full user journey through AuthUI —
     * register, then login successfully.
     * Expected: both operations succeed.
     */
    @Test
    void testFullUserJourney() {
        String registerResult = authService.register(
                "sara@example.com", "sarapass", "RestaurantManager");
        String loginResult = authService.login(
                "sara@example.com", "sarapass");
        assertTrue(registerResult.startsWith("SUCCESS"),
                "Registration should succeed.");
        assertTrue(loginResult.startsWith("SUCCESS"),
                "Login after registration should succeed.");
    }
}
