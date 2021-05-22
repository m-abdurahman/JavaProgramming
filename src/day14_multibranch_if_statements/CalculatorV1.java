package day14_multibranch_if_statements;

public class CalculatorV1 {
    public static void main(String[] args) {
        double num1 = 4;
        double num2 = 2;
        char operator = '-';
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*'){
        System.out.println(num1 * num2);
        }else if (operator == '/') {
            System.out.println(num1 / num2);
        }else{
            System.out.println("Cannot compute");
        }


    }
}
