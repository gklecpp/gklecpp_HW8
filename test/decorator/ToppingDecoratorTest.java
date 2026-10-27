package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToppingDecoratorTest {

    @Test
    void testGetDescription(){
        ToppingDecorator topping = new ToppingDecorator(new Burger()) {};
        assertEquals("Burger", topping.getDescription());
    }

    @Test
    void testGetCost(){
        ToppingDecorator topping = new ToppingDecorator(new Burger()) {};
        assertEquals(5.99, topping.getCost(), 0.001);
    }
}
