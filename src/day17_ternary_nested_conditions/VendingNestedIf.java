package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack";
        String drink = "tea";
        String snack = "candy";

        if (selection.equals("drink")){
            System.out.println(selection + " option is selected");
            if(drink.equals("tea")) {
                System.out.println(drink + " option is selected");
            }else {
                System.out.println(drink + " option is selected");
            }
        }else if (selection.equals("snack")) {
                    System.out.println(selection + " option is selected");
            System.out.println(snack + " option is selected");

        }




    }
}
