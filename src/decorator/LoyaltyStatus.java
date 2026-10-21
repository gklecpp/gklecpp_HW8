package decorator;

import java.util.Locale;

public class LoyaltyStatus {

    private String status;

    public LoyaltyStatus(String status){
        this.status = status;
    }

    public double applyDiscount(double total){
        double discount = 0;

        switch (status.toLowerCase()){
            case "silver":
                discount = 0.05;
                break;
            case "gold":
                discount = 0.10;
                break;
            case "platinum":
                discount = 0.15;
                break;
            default:
                discount = 0;
        }
        return total * (1 - discount);
    }
}
