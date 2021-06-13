package day53_inhertance.tesla;

public class ElectricCar {
    private String make;
    private String model;
    private double price;
    private int year;
    private int range;
    private static  int count; //all objected will share this variable
    public static final int MAX_RANGE = 400;


    public ElectricCar(String make, String model, double price, int year, int range) {
        setMake(make); //this & this.make = make is the same, useful when setting has condition
                        // reuse the code in the setter condition
        this.make = make;
        this.model = model;
        this.price = price;
        this.year = year;
        this.range = range;
        count++; //increase count by 1 everytime new car is created
    }

    public final void charge(){
        System.out.println("Charging the electric car using an outlet");
        range = MAX_RANGE;
        this.range = range;
    }

    public static int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", range=" + range +
                '}';


    }

    public int getRange(){
        return range;
    }

    public void setRange(int range){
        this.range = range;
    }

    protected void drive(int miles){
        if(range ==0 || range - miles <0){
            System.out.println("ERROR: Can't drive that far, need to change");
        }else{
            range -= miles;
            System.out.println("Driving " + miles + " miles...");
        }
    }



    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;

        if (make.isEmpty()) {
            System.out.println("ERROR: Make can't be blank");
        } else {

        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
