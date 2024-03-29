package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main (String [] args){
        // PRE-INCREMENT
        int num1 = 10;
        int num2 = ++num1;
        System.out.println("num1 =" + num1);
        System.out.println("num2 = " + num2);

        //POST-INCREMENT
        int num3 = 4;
        int num4 = num3;
        num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = " + apples);
        System.out.println("apples in basket = " + basket);

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi); //16
        System.out.println("kiwiBasket = " + kiwiBasket); //15

        int cars = 15;
        System.out.println(++cars);

        int sedans = 10;
        System.out.println(sedans++);
        System.out.println(sedans);

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
