package day12_conditional_statements;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("Enter total price: ");
        double totalPrice = scan.nextDouble();
        if (totalPrice >25) {
            System.out.println("You are eligible for free shipping");
        }else{
            System.out.println("you are not eligible for free shipping");
        }


    }
}
