package day53_inhertance.tesla;

public class Roadster extends ElectricCar{
    public Roadster(String model, double price, int year, int range) {
    //Roadster r = new Roadster ("Roadster", 200000, 2022, 620)
        super("Tesla", model, price, year, range);
        System.out.println("Welcome new Roadster!");
    }
}
