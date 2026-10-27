package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BurgerTest {
    @Test
    void testGetDescription(){
        FoodItem burger = new Burger();
        assertEquals("Burger", burger.getDescription());
    }

    @Test
    void testGetCost(){
        FoodItem burger = new Burger();
        assertEquals(5.99, burger.getCost(), 0.001);
    }

}
