package day55_abstraction.exercise_examples;

public class Running extends Exercise{
    @Override
    public void perform() {
        System.out.println("Performing running exercise");
    }

    /**
     *
     * @param minutes -how long the exercise is performed
     * @return - assuming average number of calories while running is 13
     */
    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 13;
    }
}
