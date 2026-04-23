import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DemoTest {

    @Test
    public void testAddition() {
        assertEquals(5, 2 + 2); // ← intentionally wrong, 2+2 is not 5
    }

    @Test
    public void testString() {
        assertEquals("hello", "world"); // ← intentionally wrong
    }
}
