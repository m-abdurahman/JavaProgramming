package day40_arraylist;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        System.out.println(nums);
        System.out.println("size = " + nums.size());

        nums.add(34);
        nums.add(44);
        nums.add(3);
        nums.add(88);
        nums.add(500);
        nums.add(5);
        nums.add(845);
        nums.add(0);
        nums.add(5);

        System.out.println("nums = " + nums);

        nums.remove(0);
        System.out.println("nums w/o 34 = " + nums);

        //System.out.println(88); -> INDEX OF OUT BOUND EXCEPTION
        nums.remove(new Integer(88)); //-> removes #88, not 88th index
        System.out.println("nums w/o 88 = " + nums);

        nums.remove(new Integer(5));
        System.out.println("nums w/o the 1st 5 = " + nums);

        //for loop - iterate through all values & print
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();

        //for each loop & print
        for (int eachNums : nums){
            System.out.print(eachNums + " ");
        }

    }
    }

