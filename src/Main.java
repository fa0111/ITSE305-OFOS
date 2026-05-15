import presentation.AuthUI;

/**
 * Main entry point for the Online Food Ordering System.
 * Launches the AuthUI presentation layer.
 */
public class Main {
    /**
     * Main method - starts the application.
     * @param args Command-line arguments 
     */
    public static void main(String[] args) {
        AuthUI ui = new AuthUI(new business.AuthService(new data.UserRepository()));
        ui.start();
    }
}
