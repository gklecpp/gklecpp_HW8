package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FoodItemsTest {
    @Test
    void testFriesDescription(){
        FoodItem fries = new Fries();
        assertEquals("Fries", fries.getDescription());
    }

    @Test
    void testFriesCost(){
        FoodItem fries = new Fries();
        assertEquals(2.99, fries.getCost(), 0.001);
    }

    @Test
    void testHotDogDescription(){
        FoodItem hotDog = new Hotdog();
        assertEquals("Hotdog", hotDog.getDescription());
    }

    @Test
    void testHotDogCost(){
        FoodItem hotDog = new Hotdog();
        assertEquals(3.99, hotDog.getCost(), 0.001);
    }

}
