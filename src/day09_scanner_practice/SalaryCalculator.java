package day09_scanner_practice;
public class SalaryCalculator {
    public static void main(String[] args){
        System.out.println("Enter hourly rate");
        double hourlyRate = 50.0;
        double weeklyPay= hourlyRate * 40; //<-HARD CORDED
        double monthlyPay= weeklyPay * 52 / 12; //<-HARD CORDED
        double annualPay= monthlyPay * 12; //<-HARD CORDED
        System.out.println("Weekly pay: " + weeklyPay);
        System.out.println("monthly Pay: " + monthlyPay);
        System.out.println("annual Pay: " + annualPay);
    }
}
