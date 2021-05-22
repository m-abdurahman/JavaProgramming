package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        //45 + 20 =65
        currentSpeed +=20;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("Can I afford the item? - " + (accountBalance>=itemPrice));

        //decrease balance by itemPrice using shorthand operator
        accountBalance -= itemPrice;

        boolean isBroke = accountBalance >=0;
        System.out.println("Am I broke? " + isBroke);


    }
}
