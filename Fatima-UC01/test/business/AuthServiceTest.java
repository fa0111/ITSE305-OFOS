package business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Business Layer - AuthService.
 * Tests all registration and login scenarios including
 * success cases, failures, and edge cases.
 */
class AuthServiceTest {

    // The object we are testing
    private AuthService authService;

    /**
     * This runs before each test.
     * Creates a fresh AuthService so tests do not affect each other.
     */
    @BeforeEach
    void setUp() {
        authService = new AuthService();
    }

    /**
     * Test: successful registration with valid inputs.
     * Expected: result starts with "SUCCESS".
     */
    @Test
    void testRegisterSuccess() {
        String result = authService.register(
                "jim@example.com", "password123", "Customer");
        assertTrue(result.startsWith("SUCCESS"),
                "Valid registration should return a SUCCESS message.");
    }

    /**
     * Test: registration with an empty username.
     * Expected: result starts with "ERROR".
     */
    @Test
    void testRegisterEmptyUsername() {
        String result = authService.register("", "password123", "Customer");
        assertTrue(result.startsWith("ERROR"),
                "Empty username should return an ERROR message.");
    }

    /**
     * Test: registration with a password that is too short (less than 6 characters).
     * Expected: result starts with "ERROR".
     */
    @Test
    void testRegisterShortPassword() {
        String result = authService.register(
                "jim@example.com", "123", "Customer");
        assertTrue(result.startsWith("ERROR"),
                "Short password should return an ERROR message.");
    }

    /**
     * Test: registration with an empty role.
     * Expected: result starts with "ERROR".
     */
    @Test
    void testRegisterEmptyRole() {
        String result = authService.register(
                "jim@example.com", "password123", "");
        assertTrue(result.startsWith("ERROR"),
                "Empty role should return an ERROR message.");
    }

    /**
     * Test: registering the same username twice.
     * Expected: second registration returns an ERROR about duplicate username.
     */
    @Test
    void testRegisterDuplicateUsername() {
        authService.register("jim@example.com", "password123", "Customer");
        String result = authService.register(
                "jim@example.com", "password456", "Customer");
        assertTrue(result.startsWith("ERROR"),
                "Duplicate username should return an ERROR message.");
    }

    /**
     * Test: successful login after registering.
     * Expected: result starts with "SUCCESS".
     */
    @Test
    void testLoginSuccess() {
        authService.register("heba@example.com", "mypassword", "Customer");
        String result = authService.login("heba@example.com", "mypassword");
        assertTrue(result.startsWith("SUCCESS"),
                "Correct credentials should return a SUCCESS message.");
    }

    /**
     * Test: login with wrong password.
     * Expected: result starts with "ERROR".
     */
    @Test
    void testLoginWrongPassword() {
        authService.register("heba@example.com", "mypassword", "Customer");
        String result = authService.login("heba@example.com", "wrongpassword");
        assertTrue(result.startsWith("ERROR"),
                "Wrong password should return an ERROR message.");
    }

    /**
     * Test: login with a username that was never registered.
     * Expected: result starts with "ERROR".
     */
    @Test
    void testLoginUserNotFound() {
        String result = authService.login(
                "nobody@example.com", "somepassword");
        assertTrue(result.startsWith("ERROR"),
                "Non-existent user login should return an ERROR message.");
    }

    /**
     * Test: login with empty username.
     * Expected: result starts with "ERROR".
     */
    @Test
    void testLoginEmptyUsername() {
        String result = authService.login("", "somepassword");
        assertTrue(result.startsWith("ERROR"),
                "Empty username at login should return an ERROR message.");
    }

    /**
     * Test: login with empty password.
     * Expected: result starts with "ERROR".
     */
    @Test
    void testLoginEmptyPassword() {
        String result = authService.login("jim@example.com", "");
        assertTrue(result.startsWith("ERROR"),
                "Empty password at login should return an ERROR message.");
    }
}
