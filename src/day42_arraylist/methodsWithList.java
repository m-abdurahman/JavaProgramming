package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class methodsWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Java"); words.add("html"); words.add("selenium"); words.add("input"); words.add("title");
        printStrList(words);
        //OR
        printStrList(Arrays.asList("select", "option", "br", "python", "SQL", "API"));


        List<Integer> nums = Arrays.asList(23, 54, 1, 67, 354, 2, 4);
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);


    }

    public static void printStrList(List<String> str) {
        for (String eachStr: str){
            System.out.print(eachStr + " ");
        }
        System.out.println();
    }


       public static int sumIntegerList(List<Integer> list){
        int sum =0;
        for (int eachList:list){
            sum +=eachList;
        }
        return sum;
       }


    }

