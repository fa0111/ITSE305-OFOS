package business;

import data.CartRepository;
import java.util.Map;
import java.util.Scanner;

/**
 * Business Layer - CartService
 * Handles all cart operations and interacts with the data layer.
 */
public class CartService {

    private CartRepository cartRepo; // Use the data layer
    private Scanner scanner;

    public CartService() {
        this.cartRepo = new CartRepository(); // initialize repository
        this.scanner = new Scanner(System.in);
    }

    /**
     * Handles adding an item from user input.
     */
    private void handleAddItem() {
        System.out.print("Enter item name: ");
        String item = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int qty = Integer.parseInt(scanner.nextLine());

        String result = addToCart(item, qty);
        System.out.println(result);
    }

    /**
     * Handles viewing the cart.
     */
    private void handleViewCart() {
        Map<String, Integer> cart = viewCart();

        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("\nItems in cart:");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println("- " + entry.getKey() + " x " + entry.getValue());
        }
    }

    /**
     * Handles clearing the cart.
     */
    private void handleClearCart() {
        String result = clearCart();
        System.out.println(result);
    }

    /**
     * Adds an item to the cart using the repository.
     */
    public String addToCart(String item, int qty) {
        cartRepo.addItem(item, qty);
        return qty + " x " + item + " added to cart.";
    }

    /**
     * Returns the current cart from the repository.
     */
    public Map<String, Integer> viewCart() {
        return cartRepo.getCart();
    }

    /**
     * Clears the cart using the repository.
     */
    public String clearCart() {
        cartRepo.clearCart();
        return "Cart cleared.";
    }

    /**
     * Returns true if the cart is empty.
     */
    public boolean isCartEmpty() {
        return cartRepo.isEmpty();
    }
}