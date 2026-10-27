package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OrderTest {

    @Test
    void testAddItem(){
        Order order = new Order();
        order.addItem(new Burger());

        assertEquals(5.99, order.getTotalCost(), 0.001);
    }

    @Test
    void testGetTotalCost(){
        Order order = new Order();

        order.addItem(new Cheese(new Burger()));
        order.addItem(new Ketchup(new Fries()));

        assertEquals(10.23, order.getTotalCost(), 0.001);
    }

    @Test
    void testDisplayOrder(){
        Order order = new Order();
        order.addItem(new Burger());

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;

        try{
            System.setOut(new PrintStream(output));
            order.displayOrder();
        } finally {
            System.setOut(originalOut);
        }

        String result = output.toString();

        assertTrue(result.contains("Burger: $5.99"));
        assertTrue(result.contains("Subtotal: $5.99"));
    }
}
