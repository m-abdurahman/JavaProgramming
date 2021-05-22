package day12_conditional_statements;

public class IfElseStatements {
    public static void main(String[] args) {
        if (10 > 5) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        int count = 25;
        if (count > 30) {
            System.out.println("count is more than 30");
        }else {
            System.out.println("count is less than 30");
        }

        byte age = 10;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
            System.out.println("Age is greater or equal to 18");
        } else {
            System.out.println("you are not eligible to vote");
            System.out.println("Age is less than 18");

        }


    }
}
