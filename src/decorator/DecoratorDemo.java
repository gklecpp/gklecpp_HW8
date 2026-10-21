package decorator;

public class DecoratorDemo {

    public static void main(String[] args){

        // create food items with toppings
        FoodItem burger = new Burger();
        burger = new Cheese(burger);
        burger = new Onions(burger);

        FoodItem fries = new Fries();
        fries = new Ketchup(fries);

        FoodItem hotdog = new Hotdog();
        hotdog = new Cheese(hotdog);
        hotdog = new Ketchup(hotdog);

        // create customer order
        Order order = new Order();

        order.addItem(burger);
        order.addItem(fries);
        order.addItem(hotdog);

        //display order and subtotal
        order.displayOrder();

        // apply loyalty discounts
        double total = order.getTotalCost();

        System.out.println("\n=== Loyalty Discounts ===");

        LoyaltyStatus regular = new LoyaltyStatus("Regular");
        LoyaltyStatus silver = new LoyaltyStatus("Silver");
        LoyaltyStatus gold = new LoyaltyStatus("Gold");
        LoyaltyStatus platinum = new LoyaltyStatus("Platinum");

        System.out.printf("Regular Total: $%.2f%n", regular.applyDiscount(total));

        System.out.printf("Silver Total: $%.2f%n", silver.applyDiscount(total));

        System.out.printf("Gold Total: $%.2f%n", gold.applyDiscount(total));

        System.out.printf("Platinum Total: $%.2f%n", platinum.applyDiscount(total));




    }
}
