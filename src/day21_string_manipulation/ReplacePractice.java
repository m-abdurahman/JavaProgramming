package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word ="github";

        System.out.println(word.replace("hub", "lab"));

        word = word.replace ("hub", "lab");
        System.out.println("word= "+ word);

        //gitlab i->o & a->i
        System.out.println(word.replace("i", "o").replace("a","i"));

        String sentence = "java is fun!";
        String withNospaces = sentence.replace(" ", "");
        System.out.println(withNospaces);
        System.out.println(sentence.replace("java", "selenium").replace("fun", "a lot of fun"));
        sentence = sentence.replace("java", "selenium").replace("fun", "a lot of fun");
        System.out.println("sentence = " + sentence);

        String result = "1-48 of over 4,000 results for java books";
        result = result.replace("1-48 of over", "")
                       .replace(",","")
                       .replace("results for java books", "");
        System.out.println("result= " + result);

    }
}
