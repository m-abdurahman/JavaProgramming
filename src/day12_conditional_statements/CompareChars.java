package day12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 ='J';
        System.out.println(letter1 == letter2); //65 ==74
        System.out.println(letter1 > letter2); //65 > 74
        System.out.println( letter2 > letter1); //74 > 65

        char grade = 'A';
        boolean isPass = grade <= 'D';
        System.out.println("Did you pass the exam? - " + isPass);
    }
}
