package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {

        int score = 88;
        String result;
        String result1 = (score > 60)?"pass":"fail";
        System.out.println("Result: "+ result1);


        String quality= "good";
        System.out.println(quality.equals("good")? 100:0);
        int rating = (quality.equals("good"))?100 : 0;
        System.out.println("Rating: " + rating);

        int score2 = 100;
        char grade = (score2 > 90) ? 'A':'B';
        System.out.println("Grade: " + grade);

        int score3 = 100;
        String evenOdd = (score3 % 2==0)? "even":"odd";
        System.out.println("Score: " + evenOdd);
    }
}
