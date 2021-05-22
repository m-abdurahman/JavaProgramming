package day09_scanner_practice;
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        System.out.println("Temperature Converter");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println(celsius + " degrees in celsius");


    }
}
