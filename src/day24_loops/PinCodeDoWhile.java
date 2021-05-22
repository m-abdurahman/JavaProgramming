package day24_loops;
import java.util.Scanner;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPincode = 1234;
        int pinCode; //declare before the curly brace so it's
        //visible within the while condition

        do {
            System.out.println("Enter pin code");
            pinCode = scan.nextInt();
        } while (pinCode != secretPincode);
        System.out.println("Welcome");
    }




}
