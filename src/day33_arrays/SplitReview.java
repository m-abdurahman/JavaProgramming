package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String [] wordArray = word.split("a");
        System.out.println(wordArray.length);
        int countOfA = wordArray.length;
        if(word.endsWith("a")){    //if ends with 'a', add 1 more
            System.out.println(countOfA);
        }

        String words = "java";
        String [] strArr = words.split("");
        System.out.println(Arrays.toString(strArr));


        String word2 = "java1html2sql";
        String [] word2Array = word2.split("\\d");
        System.out.println(Arrays.toString(word2Array));



    }
}
