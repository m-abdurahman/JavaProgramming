package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address(); //calling the constructor automatically
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("Mclean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipcode(22182);

        System.out.println("Cybertek address: " + cybertekAddress.toString());
        System.out.println("Street info = " + cybertekAddress.getStreet());


        Address newAddress = new Address();
        newAddress.setStreet("7921 Jones Branch Dr Suite 200");
        newAddress.setCity("Mclean");
        newAddress.setState("Virginia");
        newAddress.setZipcode(22182);
        System.out.println(newAddress.toString());

        Address papaJon = new Address("8501 Tyco Rd" , "Mclean" , "VA", 22182);

        System.out.println("Papa Jon pizza address: " + papaJon);

    }
}
