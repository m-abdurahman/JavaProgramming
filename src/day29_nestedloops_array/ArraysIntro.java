package day29_nestedloops_array;

public class ArraysIntro {
    public static void main(String[] args) {
        int [] num = new int [3];
        num [0] = 5;
        num [1] = 10;
        num [2] = 7;
        System.out.println("value at index 0 = " + num[0]);
        System.out.println("value at index 1 = " + num[1]);
        System.out.println("value at index 2 = " + num[2]);

        int i =0;
        System.out.println(num [i]);
        i++;                       // added index
        System.out.println(num [i]);

        System.out.println("number of elements = " + num.length);

        int len = num.length;
        System.out.println("len = " + len);

        num [0] = 100;
        num [1] = 300;
        num [2] = num [1];
        System.out.println("num [0] = " + num[0]);
        System.out.println("num [1] = " + num[1]);
        System.out.println("num [2] = " + num[2]);




    }
}
