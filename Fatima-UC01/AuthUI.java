package business;

import data.UserRepository;

/**
 * Business Layer - AuthService
 * Contains all business logic for user registration and login.
 * Validates inputs, hashes passwords, and communicates with the data layer.
 */
public class AuthService {

    // Dependency on the data layer
    private UserRepository userRepository;

    /**
     * Constructor - injects the UserRepository dependency.
     */
    public AuthService() {
        this.userRepository = new UserRepository();
    }

    /**
     * Registers a new user after validating input and checking for duplicates.
     * @param username The desired username (should be an email)
     * @param password The plain-text password entered by the user
     * @param role     The role selected: Customer, RestaurantManager, etc.
     * @return A message indicating success or the reason for failure
     */
    public String register(String username, String password, String role) {

        // Validate: username must not be empty
        if (username == null || username.trim().isEmpty()) {
            return "ERROR: Username cannot be empty.";
        }

        // Validate: password must be at least 6 characters
        if (password == null || password.length() < 6) {
            return "ERROR: Password must be at least 6 characters.";
        }

        // Validate: role must be provided
        if (role == null || role.trim().isEmpty()) {
            return "ERROR: Role must be selected.";
        }

        // Check for duplicate email/username
        if (userRepository.userExists(username)) {
            return "ERROR: Username already exists. Please use another email.";
        }

        // Hash the password before storing (simple simulation)
        String passwordHash = hashPassword(password);

        // Save the user to the data layer
        userRepository.saveUser(username, passwordHash);

        return "SUCCESS: Account created for " + username + " as " + role + ".";
    }

    /**
     * Authenticates a user by verifying their credentials.
     * @param username The username entered at login
     * @param password The plain-text password entered at login
     * @return A message indicating login success or failure
     */
    public String login(String username, String password) {

        // Validate inputs
        if (username == null || username.trim().isEmpty()) {
            return "ERROR: Username cannot be empty.";
        }
        if (password == null || password.trim().isEmpty()) {
            return "ERROR: Password cannot be empty.";
        }

        // Look up user in the database
        String storedHash = userRepository.findByUsername(username);

        // User not found
        if (storedHash == null) {
            return "ERROR: Invalid credentials. User not found.";
        }

        // Compare hashed password
        if (!storedHash.equals(hashPassword(password))) {
            return "ERROR: Invalid credentials. Wrong password.";
        }

        return "SUCCESS: Welcome back, " + username + "! Login successful.";
    }

    /**
     * Simulates password hashing.
     * In a real system, use BCrypt or SHA-256.
     * @param password Plain-text password
     * @return A simulated hash string
     */
    private String hashPassword(String password) {
        return "HASH_" + password.hashCode();
    }
}
