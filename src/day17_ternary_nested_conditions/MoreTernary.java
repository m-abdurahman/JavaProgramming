package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate > 45)? "accept": "reject";
        System.out.println("Reply: " + reply);

        String todaysClass = "Soft skill";
        String teacher = (todaysClass == "java")? "Saim/Murodil" : "Nadir";
        System.out.println("Today's teacher: " + teacher);

        boolean isEligibleToDrive = false;
        String driving = (isEligibleToDrive)? "Have DL, Can drive" : "No DL, Can't drive";
        System.out.println("Driving = " + driving);

    }
}
