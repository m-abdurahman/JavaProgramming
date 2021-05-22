package day15_logicalop_switch_ternary;

public class NotLogicalOperator {
    public static void main (String [] args){
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        //check if age is NOT more than 7
        int age = 20;
        if (!(age >=7)) {
            System.out.println("Need to sit in a car seat. age: " + age);
        }else{
            System.out.println("Can sit on the passenger seat. age: " + age);
        }
        //if smoking is not allowed: print "Smoking is not allowed here"
        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed) {
            System.out.println("Smoking is NOT allowed");
        }else{
            System.out.println("Smoking is allowed");
        }
        //if item is NOT affordable, print "Item is not affordable"
        boolean isAffordable = true;
        if (!isAffordable) {
            System.out.println("Item not affordable");
        }else{
            System.out.println("Item is affordable");
        }

        String env = "QA";
        if (!env.equals("QA")){
            System.out.println("In wrong environment for QA testing");
        }
        //if it's not Tesla, print "not interested"
        String carModel = "Tesla";
        if (!carModel.equals("Tesla")){
            System.out.println("Not interested");
        }


        // if inputPassword is NOT secretPassword, print "Incorrect password"
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!inputPassword.equals("abc123")) {
            System.out.println("Incorrect password");
        }

        if (!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect password");
        }


        if (!inputPassword.equals("abc321")) {
            System.out.println("Correct password");
        }else{
            System.out.println("Incorrect password");
        }

    }
}
