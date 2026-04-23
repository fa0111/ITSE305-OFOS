package data;

import java.util.HashMap;
import java.util.Map;

/**
 * Data Layer - UserRepository
 * Simulates a database using an in-memory HashMap.
 * Responsible for storing and retrieving user records.
 */
public class UserRepository {

    // Simulated database: key = username, value = hashed password
    private Map<String, String> database = new HashMap<>();

    /**
     * Saves a new user record to the simulated database.
     * @param username The user's chosen username (email)
     * @param passwordHash The hashed version of the user's password
     */
    public void saveUser(String username, String passwordHash) {
        database.put(username, passwordHash);
        System.out.println("[DB] User saved: " + username);
    }

    /**
     * Finds a user by their username.
     * @param username The username to search for
     * @return The stored password hash, or null if not found
     */
    public String findByUsername(String username) {
        return database.get(username);
    }

    /**
     * Checks whether a username already exists in the database.
     * @param username The username to check
     * @return true if the user exists, false otherwise
     */
    public boolean userExists(String username) {
        return database.containsKey(username);
    }
}
