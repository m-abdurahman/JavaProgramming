package day32_arrays_split;
import java.util.*;
public class SplitMethod {
    public static void main(String[] args) {
        String words = "java : python : selenium : html";
        String[] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = " + wordsArray.length);

        for (String each : wordsArray){
            System.out.println(each);
        }

        String sentence = "Today I am coding java arrays";
        String [] sentenceArray = sentence.split ( " ");
        System.out.println("first word: " + sentenceArray[0]);
        System.out.println("first word: " + sentence.split(" ")[0]);  //w/o storing and sprint directly
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println("number of words in the sentence " + sentenceArray.length);

        for (String eachSentence : sentenceArray){
            System.out.println(eachSentence);
        }


    }
}
