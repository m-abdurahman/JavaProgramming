package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double itemPrice = 20.0;
        boolean isPrimeMember = false;
        if (isPrimeMember){
            if (itemPrice>25){
            System.out.println("Eligible for free 2 day shipping");
        } else {
            System.out.println("Eligible for regular free shipping");
        }
    }else{
            System.out.println("Not eligible for free shipping. Fee is $10");
            }
        }

    }

