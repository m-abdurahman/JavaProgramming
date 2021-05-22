package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArraysAsLists {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 34, 54, 654);
        System.out.println("Nums = " + nums);
        //nums.add(100);
        //workaround
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(23, 34, 54, 654));
        System.out.println("num1 = " +nums1);
        nums1.add(33);
        nums1.add(56);
        System.out.println("num1 after adding = " + nums1);
        nums1.remove(0);
        nums1.remove(new Integer(34));
        System.out.println("nums afrer removing = " + nums1);

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee" , "tea", "monster", "red bull" , "coke", "pepsi", "mdew", "Kombucha"));
        System.out.println(drinksWithCaffeine);

        int caffeineAmount =0;
        for (String eachCaffeine: drinksWithCaffeine){
            if(eachCaffeine.equals("coffee") || eachCaffeine.equals("Kombucha")){
                caffeineAmount = 150;
                System.out.println(eachCaffeine + " -> " + caffeineAmount);
            }else if (eachCaffeine.equals("red bull") || eachCaffeine.equals("monster")){
                caffeineAmount = 112;
                System.out.println(eachCaffeine + " -> " + caffeineAmount);
            }else if (eachCaffeine.equals("pepsi") || eachCaffeine.equals("coke")){
                caffeineAmount = 35;
                System.out.println(eachCaffeine + " -> " + caffeineAmount);
            }else{
                System.out.println("Is not in the drink list");
            }

            switch (eachCaffeine){
                case "coffee":
                case "kombucha":
                    caffeineAmount = 150;
                    System.out.println(eachCaffeine + "->" + caffeineAmount);
                    break;
                case "red bull":
                case "monster":
                    caffeineAmount = 112;
                    System.out.println(eachCaffeine + "->" + caffeineAmount);
                    break;
                case "pepsi":
                case "coke":
                    caffeineAmount = 35;
                    System.out.println(eachCaffeine + "->" + caffeineAmount);
                    break;
                default:
                    System.out.println("Is not in the drink list");
            }
        }

        drinksWithCaffeine.forEach(eachCaffeine -> System.out.print(eachCaffeine.toUpperCase() + " "));


        drinksWithCaffeine.forEach(eachCaffeine -> {
            System.out.println("-------");
            System.out.println("each = " + eachCaffeine);
            System.out.println("-------");
        });

    }
}
