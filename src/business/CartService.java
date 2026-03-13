package business;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class CartService {

    private Map<String, Integer> cart = new HashMap<>();
    private Scanner scanner;

    public CartService() {
        this.scanner = new Scanner(System.in);
    }

    // start() and handle methods stay the same, just replace cartService.* with this.*
    private void handleAddItem() {
        System.out.print("Enter item name: ");
        String item = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int qty = Integer.parseInt(scanner.nextLine());

        String result = this.addToCart(item, qty);
        System.out.println(result);
    }

    private void handleViewCart() {
        Map<String, Integer> cart = this.viewCart();

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
        String result = this.clearCart();
        System.out.println(result);
    }

    // New methods
    public String addToCart(String item, int qty) {
        cart.put(item, cart.getOrDefault(item, 0) + qty);
        return qty + " x " + item + " added to cart.";
    }

    public Map<String, Integer> viewCart() {
        return cart;
    }

    public String clearCart() {
        cart.clear();
        return "Cart cleared.";
    }
}