package day55_abstraction.exercise_examples;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise = new Running(); //doesn't HAVE to use the same name as the beginning, this is polymorphism
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight fw = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 minute - calories = " + exercise.getCaloriesCount(30));

        running.start();
        running.perform();
        System.out.println("Running 30 minutes - calories = " +  running.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("Swimming 30 minutes - calories =  " + swimming.getCaloriesCount(30));

        fw.start();
        fw.perform();
        System.out.println("Free-weight 30 minutes - calories = " + fw.getCaloriesCount(30));


    }
}
