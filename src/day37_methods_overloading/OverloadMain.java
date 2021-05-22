package day37_methods_overloading;

import java.util.Arrays;
import java.util.*;
public class OverloadMain {
    public static void main(String[] args) {
        System.out.println("I wish joey got his hair cut");
        main(10,5);
        System.out.println(Arrays.toString(args));
    }
        public static void main (int num1, int num2){
            System.out.println("Result = " +  (num1 + num2));
        }

    }

