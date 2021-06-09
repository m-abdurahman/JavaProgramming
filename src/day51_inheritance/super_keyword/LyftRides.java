package day51_inheritance.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyftRide = new Lyft();
        LyftXL lyftXlRide = new LyftXL();
        LyftLux lyftLux = new LyftLux();

        System.out.println("lyftRide for 5 miles = $ " + lyftRide.calculateRate(5));
        System.out.println("lyftXlRide for 5 miles = $ " + Math.round(lyftXlRide.calculateRate(5)));
        System.out.println("lyftLuxRide for 5 miles = $ " + lyftLux.calculateRate(5));
    }
}
