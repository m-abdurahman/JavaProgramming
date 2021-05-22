package day31_arrays;
import java.util.Arrays;
public class ArraysUtil {
    public static void main(String[] args) {
        int [] nums = {100,5,1,7,0,-4,44,33};
        //print all values in same line
        System.out.println(Arrays.toString(nums));

        //sort nums
        Arrays.sort(nums);
        //print after sorting
        System.out.println(Arrays.toString(nums));
        //prints the smallest value after sorting; not the original order
        System.out.println("minimum value: " + nums[0]);
        System.out.println("maximum value: " + nums[nums.length-1]);

        //reverse sorting
        //Arrays.sort(nums, Collection.reveseOrder());

    }
}
