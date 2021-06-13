package day53_inhertance.tesla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla", "Model S", 48190.0, 2021, 326);
        ec1.drive(50);
        System.out.println(ec1.toString());
        //System.out.println(ec1.make); //ERROR -> make is private
        //System.out.println(ElectricCar.make); ERROR -> .make needs to be public static
        System.out.println("ec1 make = " + ec1.getMake());
        System.out.println("ec1 model = " + ec1.getModel());
        System.out.println("ec1 price = " + ec1.getPrice());
        System.out.println("ec1 year = " + ec1.getYear());
        System.out.println("ec1 range = " + ec1.getRange());

        if (ec1.getPrice() > 10000){
            System.out.println(ec1.getMake() + " - " + ec1.getModel() + " is out of my budget");
        }else{
            System.out.println("Purchasing " + ec1.toString());
        }

        System.out.println(ElectricCar.getCount());

        ElectricCar ec2 = new ElectricCar("Tesla", "Cybertruck", 59900, 2022, 300);
        System.out.println(ec2.toString());
        System.out.println("Count = " + ec2.getCount()); //call static method using object
        System.out.println("Count = " + ElectricCar.getCount()); //call static method using CLassName

        Roadster roadster = new Roadster("Roadster", 200000, 2022, 620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount()); //static method is inherited

        ModelX mx1 = new ModelX("Tesla", "Model X", 115000, 2022, 360);
        System.out.println(mx1.toString());
        mx1.drive(10);
        System.out.println("Range remaining = " + mx1.getRange());
        System.out.println("Total electric cars count = " + mx1.getCount());


    }
}
