package day46_encapsulation;

import java.util.concurrent.Callable;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setModel("Nissan Altima");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMileage(7_800);
        System.out.println("car1 mileage = " + car1.getMileage());

        System.out.println("car1 info = " + car1.toString());
        System.out.println(car1); //automatically calls toString method

        Car alfaRomero = new Car();
        alfaRomero.setModel("Alfa Romeo Giulia Ti AWD");
        alfaRomero.setYear(2017);
        alfaRomero.setMileage(16604);

        System.out.println("Model = " + alfaRomero.getModel());
        System.out.println("Year = " + alfaRomero.getYear());
        System.out.println("Mileage = " + alfaRomero.getMileage());
        System.out.println(alfaRomero);


    }
}
