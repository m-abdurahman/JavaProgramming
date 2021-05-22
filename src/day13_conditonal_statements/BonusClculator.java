package day13_conditonal_statements;

public class BonusClculator {
    public static void main(String[] args) {
        double bonus;
        double salesAmount = 1000.0;
        if (salesAmount <=2000) {
            System.out.println("Good job! You qualify for bonus");
            bonus = 50.0;
        }else {
            System.out.println("Great job! you are qualified for full bonus ");
            bonus = 100.0;
        }
            System.out.println("Your total bonus: $" + bonus);

    }
}
