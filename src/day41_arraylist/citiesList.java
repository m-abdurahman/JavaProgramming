package day41_arraylist;
import java.util.*;
public class citiesList {
    public static void main(String[] args) {
        ArrayList <String> cities = new ArrayList<>();
        cities.add("Washington D.C."); //0 index
        cities.add("NYC"); //1
        cities.add("Vienna"); //2
        cities.add("Adana"); //3
        cities.add("L.A."); //4
        // add Ashgabat t
        cities.add(0, "Ashgabat");

        System.out.println(cities);

        //print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));

        //printing count of items/cities
        System.out.println("Count of cities = " + cities.size());

        int size = cities.size();
        System.out.println("There are " + size + " cities in the list");

        //prints half of the list
        for (int i=0; i < cities.size(); i++){
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();

        for (String eachCities: cities){
            System.out.print(eachCities + " ");
        }
        System.out.println();

        cities.remove(2);
        System.out.println(cities + " ");

        cities.remove("L.A.");
        System.out.println(cities + " ");

        cities.clear();
        System.out.println(cities);

        if (cities.isEmpty()){
            System.out.println("list is empty");
        }
        if (cities.size() ==0){
            System.out.println("list is empty!");
        }





    }
}
