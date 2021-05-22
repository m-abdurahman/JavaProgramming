package day09_scanner_practice;

public class RemainderOperator {
    public static void main (String [] args){
        System.out.println(10 / 3); //3 --> since it's divided using integer / WN
        System.out.println(10 % 3); //1 --> 3+3+3+1; 1 is left after unable to add another 3 to make 10
        System.out.print(10 % 5); //0--> since 5+5 gives 10
        System.out.print(20 / 7);// 2
        System.out.print(20 % 7); //6 it needs to 6 to make it to 20 with added 7
        System.out.println(115 % 100); // 1
    }
}
