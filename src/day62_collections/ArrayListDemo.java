package day62_collections;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        List<String> cities = new ArrayList<>(); //can't ne new List b/c it can't create object so it needs to use polymorphism
        // can also use the parent class 'Collection' for the object. List extends collection
        cities.add("McLean"); //add method from collection or List interface
        cities.add("Vienna");
        cities.add("Fairfax");
        System.out.println(cities);
        System.out.println("first city = " + cities.get(0));
        System.out.println("Number of cities = " + cities.size());


    }
}
