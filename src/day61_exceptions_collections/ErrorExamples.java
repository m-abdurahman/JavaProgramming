package day61_exceptions_collections;

import java.util.ArrayList;
import java.util.List;

public class ErrorExamples {
    public static void main(String[] args) {
        try {

            myMethods();
        }catch (StackOverflowError error){
            System.out.println("StackOverflowError happened");
        }
        System.out.println("-- AFTER ERROR --");

        List<Integer> num = new ArrayList<>();
        while (true){  //shows out of memory error, using while loop
            num.add(100);
        }
    }

    static int counter = 0;
    public static void myMethods(){
        System.out.println(counter++);
        myMethods();
    }
}


