package business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CartServiceTest {

    private CartService service;

    @BeforeEach
    void setUp() {
        service = new CartService();
    }

    @Test
    void testAddToCart() {
        String result = service.addToCart("Apple", 3);

        assertEquals("3 x Apple added to cart.", result);

        Map<String, Integer> cart = service.viewCart();
        assertEquals(3, cart.get("Apple"));
    }

    @Test
    void testViewCart() {
        service.addToCart("Apple", 2);
        service.addToCart("Banana", 1);

        Map<String, Integer> cart = service.viewCart();

        assertEquals(2, cart.get("Apple"));
        assertEquals(1, cart.get("Banana"));
    }

    @Test
    void testClearCart() {
        service.addToCart("Apple", 2);

        String result = service.clearCart();

        assertEquals("Cart cleared.", result);
        assertTrue(service.isCartEmpty());
    }

    @Test
    void testIsCartEmpty() {
        assertTrue(service.isCartEmpty());

        service.addToCart("Apple", 1);

        assertFalse(service.isCartEmpty());
    }
}