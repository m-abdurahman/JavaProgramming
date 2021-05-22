package day23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "woo den sp oon";
        System.out.println(word.replace(" ", "").toUpperCase());

        String city = "ISTANBUL";
                            //find first letter /uppercase it  /find the 2nd letter & read it //lowercase it
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase());
        String capitalize = city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase();
        System.out.println("capitalize= " + capitalize);


    }
}
