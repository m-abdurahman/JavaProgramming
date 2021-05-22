package Day25_loops;

public class PrintStars {
    public static void main (String[] args){
        for (int stars =1; stars<=15; stars++){
            System.out.print("* ");
        }
        System.out.println();
        String myStars = "";
        for (int stars =0; stars <=5; stars++)
            myStars += "* "; //myStars = + "* ";
        System.out.print("My stars = * " + myStars.trim());
    }
}
