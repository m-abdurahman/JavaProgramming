package day09_scanner_practice;
import java.util.Scanner;
public class AskAge2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//create new object from a class
        System.out.println("How old are you?");
        int age = scan.nextInt(); //int age = 11;
        System.out.println(age + " -That's great!");
        // scan.close(); OPTIONALLY can close the scanner

    }
}
