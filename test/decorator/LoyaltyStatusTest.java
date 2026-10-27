package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoyaltyStatusTest {
    @Test
    void testRegularDiscount(){
        LoyaltyStatus regular = new LoyaltyStatus("Regular");
        assertEquals(100.00, regular.applyDiscount(100.00), 0.001);
    }

    @Test
    void testSilverDiscount(){
        LoyaltyStatus regular = new LoyaltyStatus("Silver");
        assertEquals(95.00, regular.applyDiscount(100.00), 0.001);
    }

    @Test
    void testGoldDiscount(){
        LoyaltyStatus regular = new LoyaltyStatus("Gold");
        assertEquals(90.00, regular.applyDiscount(100.00), 0.001);
    }

    @Test
    void testPlatinumDiscount(){
        LoyaltyStatus regular = new LoyaltyStatus("Platinum");
        assertEquals(85.00, regular.applyDiscount(100.00), 0.001);
    }
}

