package day35_methods_with_parameters;

import java.util.Locale;

public class Email {
    public static void main(String[] args) {
        buildEmail("John Ward III", "verizon");
    }
    public static void buildEmail(String name, String domain){
        name = name.toLowerCase().replace(" ","_");
        domain = domain.toLowerCase();
        System.out.println(name + "@"+ domain + ".com");

    }
}
