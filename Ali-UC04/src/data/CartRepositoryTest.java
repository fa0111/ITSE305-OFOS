package data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CartRepositoryTest {

    private CartRepository repo;

    @BeforeEach
    void setUp() {
        repo = new CartRepository();
    }

    @Test
    void testAddItem_NewItem() {
        repo.addItem("Apple", 2);
        Map<String, Integer> cart = repo.getCart();

        assertEquals(2, cart.get("Apple"));
    }

    @Test
    void testAddItem_ExistingItem() {
        repo.addItem("Apple", 2);
        repo.addItem("Apple", 3);

        Map<String, Integer> cart = repo.getCart();
        assertEquals(5, cart.get("Apple"));
    }

    @Test
    void testGetCart_ReturnsCopy() {
        repo.addItem("Apple", 2);
        Map<String, Integer> cart = repo.getCart();

        cart.put("Banana", 10); // modify returned map

        // original should NOT change
        assertFalse(repo.getCart().containsKey("Banana"));
    }

    @Test
    void testClearCart() {
        repo.addItem("Apple", 2);
        repo.clearCart();

        assertTrue(repo.isEmpty());
    }

    @Test
    void testIsEmpty() {
        assertTrue(repo.isEmpty());

        repo.addItem("Apple", 1);
        assertFalse(repo.isEmpty());
    }
}