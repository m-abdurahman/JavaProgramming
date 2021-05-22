package day15_logicalop_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Seattle";
        if (city.equals("New York") || city.equals("Seattle")) {
            System.out.println("Willing to relocate to " + city);
        }else{
            System.out.println("Not considering " + city);
        }

        String teacher = "Akbar";
        if (teacher.equals("Murodil") || teacher.equals("Saim")) {
            System.out.println("It's a java class with " + teacher);
        }else{
            System.out.println("soft skill class is with " + teacher);
        }

        //1- teacher = Saim or Murodil -> java class
        //2- teacher = Nadir -> softskill class
        //3- anyother teacher-> some class with Gurhan / Akbar
        teacher = "Murodil";
        if (teacher.equals("Murodil") || teacher.equals("Saim")) {
            System.out.println("Java class with " + teacher);
        }else if(teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        }else{
            System.out.println("Some other class with " + teacher);
        }

        // company - Google, salary >= 100000

        String company = "Google";
        double salary = 100_000.0;
        if (company.equals("Google") || salary >= 100_000.0) {
            System.out.println("Accepting position");
        }else{
            System.out.println("keep looking");
        }



    }
}
