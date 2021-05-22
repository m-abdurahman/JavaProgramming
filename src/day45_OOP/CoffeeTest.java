package day45_OOP;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("Coffee amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("Coffee amount after drink = " + myCoffee.getAmount());

        myCoffee.setType ("Turkish coffee");
        System.out.println("Coffee type = " + myCoffee.getType());

        //describe myCoffee using .toString from 'Generate' - it shows all variable values
        System.out.println(myCoffee.toString());

        Coffee coffee1 = new Coffee();
        coffee1.setType("Cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());

        //assign coffee1 object to coffee2
        Coffee coffee2 = coffee1;

        System.out.println("coffee2 type = " + coffee2.getType());

        coffee2.setType("Espresso");
        System.out.println("Coffee1 type = " + coffee1.getType());

        Coffee coffee3 = new Coffee();
        coffee3.setType("Americano");
        System.out.println("Coffee3 = " + coffee3.getType());

        coffee3 =coffee2;
        System.out.println("coffee3 type = " + coffee3.getType());

        Coffee coffee4 = null; //it only contains reference variable
        coffee4.setType("Turkish");
    }
}
