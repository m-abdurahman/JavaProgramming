package day09_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = input.nextInt();
        int dollars = cents / 100;
        int remainderCents = cents % 100;
        System.out.println("cents= " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remainderCents = " + remainderCents);
        // in 123 cents 1 dollar  & 23 cents (remainder)
        System.out.println("In " + cents + " cents, there are " + dollars + " dollars " + remainderCents + " cents");

    }
}
