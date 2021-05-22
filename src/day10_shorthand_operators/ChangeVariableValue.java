package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String [] args){
        int count = 10;
        count = count + 10;
        System.out.println("Count= " + count);

        double rent = 500;
        rent = rent + 50;
        System.out.println(rent);

        double gasPrice = 2.75;
        gasPrice = gasPrice - 1;
        System.out.println(gasPrice);

        int pizzaSlices = 8;
        pizzaSlices = pizzaSlices / 2;
        System.out.println("Pizza slices = " + pizzaSlices);
        pizzaSlices = pizzaSlices + 6; //using the value from line 18, add 6
        System.out.println("pizzaSlices = " + pizzaSlices);
        
        int players = 10;
        players = players * 2;
        System.out.println("players = " + players);

        int cents = 568;
        cents = cents % 100;
        System.out.println("cents = " + cents);


    }
}
