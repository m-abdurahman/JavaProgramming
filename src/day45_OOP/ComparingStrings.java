package day45_OOP;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java"; //in string pool
        String word2 = "Java"; //re-used from string pool
        String word3 = new String ("java"); //create in HEAP but outside string pool
        String word4 = new String ("java");

        System.out.println(word1 == word2); //TRUE same objects, string pool reused
        System.out.println(word1 = word3); //FALSE different objects
        System.out.println(word3 == word4); //FALSE, refers to different objects (though its the same object, new keyboard is independent of one another) in heap memory

        System.out.println(word1.equals(word2)); //FALSE - j vs J
        System.out.println(word1.equals(word3)); //TRUE
        System.out.println(word3.equals(word4)); //TRUE
    }
}
