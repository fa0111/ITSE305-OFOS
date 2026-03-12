package presentation;

import business.AuthService;
import java.util.Scanner;

/**
 * Presentation Layer - AuthUI
 * Handles all user interaction via the console.
 * Collects input from the user and displays results.
 * Delegates all logic to the AuthService (Business Layer).
 */
public class AuthUI {

    // Dependency on the business layer
    private AuthService authService;

    // Scanner to read user input from console
    private Scanner scanner;

    /**
     * Constructor - initializes the AuthService and Scanner.
     */
    public AuthUI() {
        this.authService = new AuthService();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Starts the main menu loop.
     * Displays options and routes user to register or login.
     */
    public void start() {
        System.out.println("======================================");
        System.out.println("  Online Food Ordering System (OFOS) ");
        System.out.println("======================================");

        boolean running = true;

        while (running) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    handleRegister();
                    break;
                case "2":
                    handleLogin();
                    break;
                case "3":
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }

    /**
     * Handles the registration flow.
     * Collects name, email, password, and role from the user.
     */
    private void handleRegister() {
        System.out.println("\n--- Register New Account ---");

        System.out.print("Enter your email (username): ");
        String username = scanner.nextLine().trim();

        System.out.print("Enter your password (min 6 characters): ");
        String password = scanner.nextLine().trim();

        System.out.println("Select your role:");
        System.out.println("  1. Customer");
        System.out.println("  2. RestaurantManager");
        System.out.println("  3. DeliveryStaff");
        System.out.print("Your role choice: ");
        String roleChoice = scanner.nextLine().trim();

        // Map role choice to role name
        String role;
        switch (roleChoice) {
            case "1": role = "Customer"; break;
            case "2": role = "RestaurantManager"; break;
            case "3": role = "DeliveryStaff"; break;
            default:  role = ""; break;
        }

        // Send to business layer and display result
        String result = authService.register(username, password, role);
        System.out.println("\n" + result);
    }

    /**
     * Handles the login flow.
     * Collects username and password from the user.
     */
    private void handleLogin() {
        System.out.println("\n--- Login ---");

        System.out.print("Enter your email (username): ");
        String username = scanner.nextLine().trim();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine().trim();

        // Send to business layer and display result
        String result = authService.login(username, password);
        System.out.println("\n" + result);
    }

    /**
     * Main entry point of the application.
     * @param args Command-line arguments (not used)
     */
    public static void main(String[] args) {
        AuthUI ui = new AuthUI();
        ui.start();
    }
}
