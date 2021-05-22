package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        //EQUALS() method - case sensitive
        System.out.println(city.equals("Chicago")); //true
        System.out.println(city.equals("chicago")); //false
        System.out.println(city.equals("Chicago ")); //false

        //EQUALS IGNORE CASE method - case INSENSITIVE
        System.out.println(city.equalsIgnoreCase("Chicago")); //true
        System.out.println(city.equalsIgnoreCase("CHICAGO")); //true
        System.out.println(city.equalsIgnoreCase("ChiCaGo")); //true
        System.out.println(city.equalsIgnoreCase("Chi cago")); //false

        if (city.equals("CHICAGO")) {
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false");
        }

        if(city.equalsIgnoreCase("CHICAGO")) {
            System.out.println("equalsIgnoreCase() true"); // prints true since it runs top to bottom (both are true)
        }else{
            System.out.println("equalsIgnoreCase() false");
        }

    }
}
