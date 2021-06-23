package day56_abstraction.drivable;

public interface SelfDrivable {
    void autoPiloting();
    //void selfPark(); -> ERROR in subclasses, needs to be implemented/overridden abstract method
    public default void selfPark(){ //provide default implementation
        // to a method to be easier to not break code
        System.out.println("performing self park steps");
    }
}


