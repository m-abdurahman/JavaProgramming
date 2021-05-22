package day04_variables_intro;

public class VariablesPractice {
    public static void main(String[] args){
        //declare variable students that stores number
        int students;
        students=50;
        System.out.println(students);
        students=70; //assign new value of 70
        System.out.println(students);

        students=111;
        students=125;  //value 125 will print even with the value above
        System.out.println(students);

        int teachers;
        teachers=2;
        int mentors;
        mentors=25;

        System.out.print("Number of teachers:");
        System.out.println(teachers);

        System.out.print("number of mentors:");
        System.out.println(mentors);

    }
}
