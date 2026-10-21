package decorator;

public class Hotdog implements FoodItem{

    @Override
    public String getDescription(){
        return "Hotdog";
    }

    @Override
    public double getCost(){
        return 3.99;
    }
}
