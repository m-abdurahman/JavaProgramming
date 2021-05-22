package day24_loops;
import java.util.*;
public class GuessTheNumberGame {
    public static void main(String[] args) {
        //assign & generate randomized numbers (when debugging, shows random secret number
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);
        //System.out.println(randomNum.nextInt(101));
        int secretNumber = randomNum.nextInt(101);
        int guessingNumber;

        do {
            System.out.println("Guess th secret number");
            guessingNumber = scan.nextInt();
            if (guessingNumber > secretNumber) {
                System.out.println("Wrong, number is too large");
            } else if (guessingNumber < secretNumber) {
                System.out.println("Wrong, number is too small");
            }
        }while (guessingNumber != secretNumber) ;
            System.out.println("Congrats! You won! secret number is " + secretNumber);
        }

}
