package data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Data Layer - UserRepository.
 * Tests all methods: saveUser, findByUsername, and userExists.
 */
class UserRepositoryTest {

    // The object we are testing
    private UserRepository userRepository;

    /**
     * This runs before each test.
     * Creates a fresh UserRepository so tests do not affect each other.
     */
    @BeforeEach
    void setUp() {
        userRepository = new UserRepository();
    }

    /**
     * Test: saving a user and then finding them by username.
     * Expected: the stored password hash matches what was saved.
     */
    @Test
    void testSaveAndFindUser() {
        userRepository.saveUser("ali@example.com", "HASH_123");
        String result = userRepository.findByUsername("ali@example.com");
        assertEquals("HASH_123", result,
                "The stored password hash should match the saved one.");
    }

    /**
     * Test: checking that a user exists after being saved.
     * Expected: userExists returns true.
     */
    @Test
    void testUserExistsAfterSaving() {
        userRepository.saveUser("sara@example.com", "HASH_456");
        assertTrue(userRepository.userExists("sara@example.com"),
                "User should exist after being saved.");
    }

    /**
     * Test: checking that a user does not exist before being saved.
     * Expected: userExists returns false.
     */
    @Test
    void testUserDoesNotExistBeforeSaving() {
        assertFalse(userRepository.userExists("unknown@example.com"),
                "User should not exist before being saved.");
    }

    /**
     * Test: finding a user that does not exist.
     * Expected: findByUsername returns null.
     */
    @Test
    void testFindNonExistentUser() {
        String result = userRepository.findByUsername("ghost@example.com");
        assertNull(result,
                "Finding a non-existent user should return null.");
    }

    /**
     * Test: saving two different users.
     * Expected: both users exist independently.
     */
    @Test
    void testSaveMultipleUsers() {
        userRepository.saveUser("user1@example.com", "HASH_AAA");
        userRepository.saveUser("user2@example.com", "HASH_BBB");
        assertTrue(userRepository.userExists("user1@example.com"),
                "First user should exist.");
        assertTrue(userRepository.userExists("user2@example.com"),
                "Second user should exist.");
    }
}
