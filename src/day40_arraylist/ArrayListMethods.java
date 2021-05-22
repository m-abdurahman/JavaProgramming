package day40_arraylist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List <String> shoppingList = new ArrayList<>();
        System.out.println("Size = " + shoppingList.size());
        System.out.println("isEmpty? = " +shoppingList.isEmpty() );

        if (shoppingList.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List is not empty");
        }

        shoppingList.add("shoes");
        shoppingList.add("monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        if (shoppingList.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List is not empty");
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);

        System.out.println("Is shoes in my list? " + shoppingList.contains("shoes"));

        if (shoppingList.contains("shoes")){
            System.out.println("I have shoes in my shopping list");
        }else{
            System.out.println("I need to buy shoes");
        }

        shoppingList.remove("shoes");
        System.out.println(shoppingList);

        shoppingList.clear(); //clears the list/removes items
        System.out.println("shopping list = " + shoppingList);
    }
}
