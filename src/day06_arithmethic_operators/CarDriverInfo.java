package day06_arithmethic_operators;

public class CarDriverInfo {
    public static void main (String[] args){
        String carModel= "Dodge Charger";
        String driverName= "Miya Abdurahman";
        String liscenceNum= "FG50692049567";
        short speed= 120;
        boolean isAutomatic= true;
        char liscenceClass= 'C';

        System.out.println("Car model:\t" + carModel);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Liscence Number: \t" + liscenceNum);
        System.out.println("Car Speed:\t" + speed + "MPH");
        System.out.println("Automatic:\t\t" + isAutomatic);
        System.out.println("Liscence class: " + liscenceClass);

        System.out.println(driverName + "is driving a " + carModel);
        System.out.println(liscenceClass + " " + isAutomatic);

        String first= "Adam";
        String last= "Smith";
        String full= first + " " + last;
        System.out.println(full);





    }
}
