package day24_loops;
import java.util.Scanner;
public class CountUntil {
    public static void main(String[] args) {
        int numberToStop, start;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        numberToStop = keyboard.nextInt();

        start = 1;
        while (start <= numberToStop) {
            System.out.print(start + " ");
            start++;
        }
    }
}
