package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        System.out.println("#### WELCOME TO ADAIRE APARTMENTS ###");
        byte numOfBedrooms = 4;
        double price = 0.0;
        switch (numOfBedrooms){
            case 0:
            System.out.println("Studio apartment selected");
            price = 1_454.0;
            break;
            case 1:
                System.out.println("One bedroom apartment selected");
                price = 1_725;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                price =2_899;
                break;
                default:
                    System.out.println(numOfBedrooms + " bedroom currently unavailable");

                    //RETURN -> EXISTS MAIN METHOD



        }
        System.out.println("Starting price $"+ price);
    }
}
