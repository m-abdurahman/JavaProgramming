package day55_abstraction.exercise_examples;

public class FreeWeight extends Lifting{ //non-abstract class, inherits all the methods
    @Override
    public void perform() {
        System.out.println("Performing free-weight lifting exercise");

    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes* 6;
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack the dumbbells back in place");

    }
}
