package day15_logicalop_switch_ternary;

public class UsedCarSelector {
    public static void main (String [] args) {
        double budget = 5000.0;
        double carPrice = 4999.0;
        String model = "Ford";
        if (carPrice <= budget && (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla"))){
            System.out.println("I would like to purchase the car " + model + " at price $" + carPrice);
        }else{
            System.out.println("Keep looking for car");
        }


    }
}
