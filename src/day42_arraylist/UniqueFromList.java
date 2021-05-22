package day42_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));
//new arraylist to store only unique numbers
        List<Integer> unqieList = getUniqueIntegers(nums);
        System.out.println("\nuniqueList = " + unqieList);

        }

    public static List<Integer> getUniqueIntegers(List<Integer> nums) {
        List<Integer> unqieList = new ArrayList<>();
        for (int eachNums : nums){
            if (Collections.frequency(nums, eachNums) ==1) {
                System.out.print(eachNums + " ");
                unqieList.add(eachNums);
            }
            }
        return unqieList;
    }

}
