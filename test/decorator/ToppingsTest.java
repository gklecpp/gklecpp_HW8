package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToppingsTest {
    @Test
    void testCheeseDescription(){
        FoodItem burger = new Cheese(new Burger());
        assertEquals("Burger, Cheese", burger.getDescription());
    }

    @Test
    void testCheeseCost(){
        FoodItem burger = new Cheese(new Burger());
        assertEquals(6.99, burger.getCost(), 0.001);
    }

    @Test
    void testKetchupDescription(){
        FoodItem fries = new Ketchup(new Fries());
        assertEquals("Fries, Ketchup", fries.getDescription());
    }

    @Test
    void testKetchupCost(){
        FoodItem fries = new Ketchup(new Fries());
        assertEquals(3.24, fries.getCost(), 0.001);
    }

    @Test
    void testOnionsDescription(){
        FoodItem burger = new Onions(new Burger());
        assertEquals("Burger, Onions", burger.getDescription());
    }

    @Test
    void testOnionsCost(){
        FoodItem burger = new Onions(new Burger());
        assertEquals(6.49, burger.getCost(), 0.001);
    }

    @Test
    void testMultipleToppings(){
        FoodItem burger = new Onions(new Cheese(new Burger()));

        assertEquals("Burger, Cheese, Onions", burger.getDescription());

        assertEquals(7.49, burger.getCost(), 0.001);
    }
}
