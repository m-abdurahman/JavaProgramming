package day15_logicalop_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        //location, salary, remote, & benefits
        double salary = 100_000.0;
        boolean isRemote = true;
        boolean HasBenefits = false;
        String location = "New York";

        if (location.equals("New York") && isRemote && HasBenefits && salary >=100_000) {
            System.out.println("I will accept this offer");
        }else{
            System.out.println("Keep looking");
        }
    }
}
