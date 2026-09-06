package labtasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ShoppingCartTest {

    @Test
    public void testAddItems_CountIsThree() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple");
        cart.addItem("Bread");
        cart.addItem("Milk");
        assertEquals(3, cart.getItemCount());
    }

    @Test
    public void testRemoveItem_CountDecreases() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple");
        cart.addItem("Bread");
        cart.removeItem("Apple");
        assertEquals(1, cart.getItemCount());
    }

    @Test
    public void testClearCart_CountIsZero() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple");
        cart.addItem("Bread");
        cart.clear();
        assertEquals(0, cart.getItemCount());
    }

    @Test
    public void testRemoveNonExistentItem_DoesNotThrow() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple");
        assertDoesNotThrow(() -> cart.removeItem("Banana"));
        assertEquals(1, cart.getItemCount());
    }
}
