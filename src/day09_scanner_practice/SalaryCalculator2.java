package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator2 {
    public static void main(String[] args){
        Scanner calc =new Scanner(System.in);
        System.out.println("Enter hourly rate");
        double hourlyRate = calc.nextDouble();
        double weeklyPay= hourlyRate * 40;
        double monthlyPay= weeklyPay * 52 / 12;
        double annualPay= monthlyPay * 12;

        System.out.println("Weekly pay: " + weeklyPay);
        System.out.println("monthly Pay: " + monthlyPay);
        System.out.println("annual Pay: " + annualPay);

    }
}
