package day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheckV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current speed limit");
        int currentSpeed = scan.nextInt();
        int SpeedLimit = 55;
        int overTheLimit = currentSpeed - SpeedLimit;
        System.out.println("You are driving " + overTheLimit + "mph over the limit.");
    }
}
