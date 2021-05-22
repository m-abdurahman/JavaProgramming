package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        double sum = add (5,8);
        System.out.println(sum);

        System.out.println(add(100,200));
        System.out.println(minus(14,8));
        System.out.println(minus(2,10));
        System.out.println(divide(40,5));
    }

    public static double add(double num1, double num2){
        double result = num1 + num2;
        return result; //or just return num1 + num2
    }
    public static double minus (double num1, double num2){
        double result = num1 - num2;
        return result;
    }
    public static double multiply (int num1, int num2){
        double result = num1 * num2;
        return result;
    }
    public static double divide (int num1, int num2){
        double result = num1/num2;
        return result;
    }
}
