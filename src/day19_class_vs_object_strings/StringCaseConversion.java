package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "Cybertek";
        String sentence = "Java IS Fun";
        System.out.println(word); //Cybertek
        System.out.println(word.toLowerCase());//cybertek
        System.out.println("Cybertek".toLowerCase());
        System.out.println(word.toUpperCase()); //CYBERTEK
        System.out.println("Cybertek".toUpperCase());

        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());

        //Re assigning variables
        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase= " + wordInLcase);

        word = word.toLowerCase();
        System.out.println("word= " + word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("Amazon".toUpperCase());
        System.out.println("Company is "+company.toUpperCase());
        
        //change variable company "Amazon" to "AMAZON"
        System.out.println("company = " + company);   
        company = company.toUpperCase();
        System.out.println("company = " + company);





    }
}
