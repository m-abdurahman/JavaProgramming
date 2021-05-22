package day15_logicalop_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "wooden spoon";
        if (onSale && freeShipping) {
            System.out.println(itemName + " added to the cart");
        } else {
            System.out.println("Continue shopping for " + itemName);
        }

        if (onSale && freeShipping && itemName.equals("wooden spoon")) {
            System.out.println(itemName + " added to the cart");
        }else{
            System.out.println("Continue shopping for "+ itemName);
        }
    }

}
