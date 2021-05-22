package day20_string_manipulation;

public class StringContains {
    public static void main (String [] args){
        String company = "Capital one";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));

        if (company.contains(" ")) {
            System.out.println("multiple words company name");
        }else{
            System.out.println("Single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";

        if (etsyTitle.contains(" | ")) {
            System.out.println("Title check - pass");
        }else{
            System.out.println("Title check - fail");
        }

        String firstName = "Miya";
        if (firstName.contains("i") || firstName.contains("a")) {
            System.out.println("Correct");
        }else{
            System.out.println("Incorrect");

        }

        String email = "MURODIL@cybertekschool.com";
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("Correct email address");
        }else{
            System.out.println("Invalid email address");
        }

        //Case insensitive
        if (email.toLowerCase().contains("d")) { //<- method chaining
            System.out.println("d is present");
        }else{
            System.out.println("invalid");

        }


    }
}
