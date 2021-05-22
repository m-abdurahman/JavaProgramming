package day13_conditonal_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if(isHungry) {
            System.out.println("I am hungry, I will go get something to eat!");
        }else{
            System.out.println("I am not hungry, Let's keep coding java");
        }
        double price = 130.44;
        boolean isAffordable = 200.0 <= price;
        if (isAffordable) {
            System.out.println("It is affordable!");
        }else{
            System.out.println("I can't afford it!");
        }

        boolean isRemoteJob = true;
        if (!isRemoteJob) { //-> read as NOT / false
            System.out.println("Sure I am interested!");
        }else{
            System.out.println("Sorry, I am not interested!");
        }


    }
}
