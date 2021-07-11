package day61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 70;
        System.out.println("class is going for " + minutes + " minutes");
        if (minutes >50){
            throw new BreakTimeException("It's break time!");
        }
        System.out.println("Let's continue the class");


        int balance = 400;
        int itemPrice = 500;
        if (itemPrice > balance){
            throw new InsufficientBalanceException ("Transaction declined. Not enough funds");
        }else{
            System.out.println("Item successfully purchased!");
        }
    }
}
