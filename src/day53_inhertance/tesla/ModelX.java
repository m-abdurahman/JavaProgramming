package day53_inhertance.tesla;

public class ModelX extends ElectricCar{
    public ModelX(String make, String model, double price, int year, int range) {
        super(make, model, price, year, range);
    }

    /**
     * ERROR below, b/c charge is final method, can't be overridden
     */
    //public void charge(){
    //}
}
