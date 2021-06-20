package day55_abstraction.exercise_examples;

public abstract class Exercise {
    public void start(){ //non-abstract method since it doesn't have the 'abstract' keyword
        System.out.println("Warming up and starting the exercise");
    }

    /**
     * abstract method without body(body means implementation), just signature
     * purpose- letting sub classes to implement/override their own way
     */
    public abstract void perform(); //needs 'abstract' keyword to work

    /**
     * another abstract method that concrete sub classes will override/implement
     * @param minutes -how long the exercise is performed
     * @return - number of calories burned
     */
    public abstract int getCaloriesCount(int minutes);

}
