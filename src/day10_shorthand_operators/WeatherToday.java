package day10_shorthand_operators;
import java.util.Scanner;
public class WeatherToday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How is the weather today?");
        // String weather = input.next(); -> only accepts single letter / words until space
        String weather = input.nextLine();
        System.out.println(weather + " - is a nice day!");





    }
}
