package day15_logicalop_switch_ternary;

public class GradeEvaluator {
    public static void main(String [] args){
        char grade ='A';
        if (grade == 'A' || grade =='B' || grade =='C') {
            System.out.println("passed with grade " + grade);
        }else if (grade =='D') {
            System.out.println("Qualify for retake with grade " + grade);
        }else if (grade =='E') {
            System.out.println("Failed with grade " + grade);
        }else{
            System.out.println("Invalid grade");
        }

        //USING lower cases//
        if (grade == 'A' || grade == 'a' || grade =='B' || grade == 'b' || grade =='C' || grade == 'c') {
            System.out.println("passed with grade " + grade);
        }else if (grade =='D') {
            System.out.println("Qualify for retake with grade " + grade);
        }else if (grade =='E') {
            System.out.println("Failed with grade " + grade);
        }else{
            System.out.println("Invalid grade");
        }
    }
}
