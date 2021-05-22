package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();
    }
    public static void pressGasPedal(){  //can be in any order when writing code
        System.out.println("4. Hold steering wheel with 2 hands and press on the gas pedal");
    }

    public static void seatInCar(){
        System.out.println("1. Open the door & sit in the driver's seat");
    }
    public static void startTheCar(){
        System.out.println("2. Insert key to ignition & turn it clockwise");
    }
    public static void shiftToDrive(){
        System.out.println("3. Press brake pedal & shift to 'D' on the gear");
    }
}
