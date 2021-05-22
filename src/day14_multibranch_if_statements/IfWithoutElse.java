package day14_multibranch_if_statements;

public class IfWithoutElse {
    public static void main (String [] args){
        int year = 2020;
        if (year==2020){
            System.out.println("Covid19 pandemic year");

        }
        System.out.println("Keep coding java");
        String country = "USA";
        if (country.equals ("USA")){
            System.out.println("Washington D.C. is the capital");
            System.out.println("White House is on Pennsylvania Avenue");
        }

        System.out.println("Welcome to " + country);
    }
}
