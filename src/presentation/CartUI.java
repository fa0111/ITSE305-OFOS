package presentation;

import business.CartService;
import java.util.Map;
import java.util.Scanner;

/**
 * Presentation Layer - CartUI
 * Handles user interaction for cart operations via console.
 */
public class CartUI {

    private CartService cartService;
    private Scanner scanner;

    public CartUI() {
        this.cartService = new CartService();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Starts the cart menu loop.
     */
    public void start() {

        boolean running = true;

        while (running) {
            System.out.println("\n=== Shopping Cart Menu ===");
            System.out.println("1. Add Item to Cart");
            System.out.println("2. View Cart");
            System.out.println("3. Clear Cart");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    handleAddItem();
                    break;
                case "2":
                    handleViewCart();
                    break;
                case "3":
                    handleClearCart();
                    break;
                case "4":
                    running = false;
                    System.out.println("Exiting cart...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void handleAddItem() {
        System.out.print("Enter item name: ");
        String item = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int qty = Integer.parseInt(scanner.nextLine());

        String result = cartService.addToCart(item, qty);
        System.out.println(result);
    }

    private void handleViewCart() {
        Map<String, Integer> cart = cartService.viewCart();

        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("\nItems in cart:");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println("- " + entry.getKey() + " x " + entry.getValue());
        }
    }

    private void handleClearCart() {
        String result = cartService.clearCart();
        System.out.println(result);
    }
}