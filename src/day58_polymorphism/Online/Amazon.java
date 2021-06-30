package day58_polymorphism.Online;

public class Amazon extends OnlineShopping implements Prime{
    @Override
    public void buy() {
        System.out.println("Buy items from on Amazon.com");
    }

    @Override
    public void sell() {
        System.out.println("Selling items on Amazon.com");

    }

    @Override
    public void primeShipping() {
        System.out.println("Free 2 day shipping for Prime users");
    }
}
