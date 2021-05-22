package day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        Scanner shopping = new Scanner(System.in);
        System.out.println("Enter price for milk");
        double milk = shopping.nextDouble();
        System.out.println("Enter price for bread");
        double bread = shopping.nextDouble();
        System.out.println("Enter price for cucumber");
        double cucumber = shopping.nextDouble();
        double total= milk + bread + cucumber;
        System.out.println("Total price is $" + total);


    }
}
