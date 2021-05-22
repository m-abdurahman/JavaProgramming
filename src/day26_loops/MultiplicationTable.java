package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 11;

        if (number <=1 || number >10) {
            System.out.println("Error: invalid input");
            return;    //EXIT MAIN METHOD aka stop run of the program
        }
        for (int n = 1; n<=10; n++){
            int total = number * n;
            System.out.println(number + "x" + n + " = " + total);



            }
        }

}
