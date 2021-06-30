package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        Worker worker = new Superman();
        worker.work("QA Manager");
        worker.getPaid();
        //worker.raiseKid(); -> ERROR, can't access the method from class that's not Worker

        ((Father)worker).raiseKid();
        ((Superman)worker).playWithKid();
    }
}
