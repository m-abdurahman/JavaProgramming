package day58_polymorphism;

public class SupermanTest {
    public static void main(String[] args) {
        Father spMan1 = new Superman();
        spMan1.playWithKid();
        spMan1.feedKid();
        spMan1.raiseKid();
        //spMan1.work("SDET"); -> ERROR; it can only access Father type's methods

        Worker spMan2 = new Superman();
        spMan2.work("SDET");
        System.out.println("got paid $" + spMan2.getPaid());
        //spMan2.raiseKid(); -> ERROR, wrong method, doesn't have access

        Superman spMan3 = new Superman();
        spMan3.getPaid();
        spMan3.feedKid();
        spMan3.work("Scrum Master");
        spMan3.playWithKid();
        spMan3.raiseKid();


    }
}
