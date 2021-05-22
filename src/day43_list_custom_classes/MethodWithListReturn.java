package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodWithListReturn {
    public static void main(String[] args) {

        long startArray = System.nanoTime();
        int arr [] = getIntegerArray();
        long endArray = System.nanoTime();
        double seconds = (endArray - startArray) / 1_000_000_000.0;

        //System.out.println(arr);
        System.out.println("Array time = " + (endArray - startArray));
        System.out.println("Array time seconds = " + seconds);



        //1 nanoseconds = 1 billion of a second
        long start = System.nanoTime();
        List<Integer> milNums = getIntegerList();
        long end = System.nanoTime();
        System.out.println("Arraylist time = " + (end - start));

        //System.out.println(milNums);

    }

    public static List<Integer> getIntegerList(){
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 100_000; i++){
            nums.add(i);
        }
        return nums;
    }

    public static int [] getIntegerArray() {

        int[] numArr = new int [100_001];
        for (int i = 0; i <= 100_001; i++) {
            numArr[i] = i;
        }
        return numArr;
    }
}
