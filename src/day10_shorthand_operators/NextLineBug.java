package day10_shorthand_operators;
import java.util.Scanner;
public class NextLineBug {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value: ");
        double rent = input.nextDouble();
        //WORK AROUND below
        input.nextLine();
        String month = input.nextLine();
        System.out.println("rent = " + rent);
        System.out.println("month = " + month);
    }
}
