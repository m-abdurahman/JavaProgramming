package day15_logicalop_switch_ternary;

public class ORLogicalOperator {
    public static void main(String[] args) {
        System.out.println("True || True = " + (true || true));
        System.out.println("True || False = " + (true || false));
        System.out.println("False || True = " + (false || true));
        System.out.println("False || False = " + (false || false));

        byte apples = 5;
        byte oranges = 7;
        System.out.println(apples > 3 || oranges > 4);

        // TRUE OR TRUE
        if (apples > 3 || oranges > 4) {
            System.out.println("No need to buy any fruits");
        }else{
            System.out.println("Need to buy fruits");
        }
        // TRUE OR FALSE
        System.out.println(apples > 2 || oranges >10);

                      // TRUE AND FALSE
        System.out.println(apples> 2 && oranges > 10);

        if (apples > 2 || oranges > 10) {
            System.out.println("Looks like we are good with fruits");
        }else{
            System.out.println("Need to buy more fruits");
        }

        //FALSE OR FALSE
        System.out.println(apples == 0 || oranges ==0);
        if (apples == 0 || oranges ==0) {
            System.out.println("We need to purchase some fruits");
        }else{
            System.out.println("We are good with fruits");
        }

    }
}
