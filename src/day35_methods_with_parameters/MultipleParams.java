package day35_methods_with_parameters;
import java.util.Scanner;
public class MultipleParams {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter 2 numbers");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        showSum(n1,n2);

    }
    public static void showSum(double num1, double num2){
        double result = num1 + num2;
        System.out.println(result);
    }
}
