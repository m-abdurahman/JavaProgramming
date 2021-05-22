package day32_arrays_split;

public class sentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String [] words = sentence.split(" ");
        System.out.println("first word = " + words[0]);
        System.out.println("second word = " + words [1]);
        System.out.println("third word = " + words[2]);
        //System.out.println("forth word = " + words[3]);

        for ( String w : words){
            System.out.println(w);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String [] results = googleResult.split(" ");
        System.out.println(results[3]);
        System.out.println(googleResult.split(" ")[1]);
        System.out.println(googleResult.split(" ")[3].replace("(", ""));
        System.out.println(googleResult.split(" ")[3].substring(1));



    }
}
