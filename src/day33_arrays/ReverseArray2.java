package day33_arrays;
import java.util.Arrays;
public class ReverseArray2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 =30;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //swap using additional variables
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int [] nums = {5, 10, 4, 100};
        System.out.println("Before swap: " + Arrays.toString(nums));

        temp = nums[0];
        nums[0] = nums[3];
        nums[3] = temp;
        System.out.println("After 1st and last swap: "+ Arrays.toString(nums));

        int [] nums2 = {5, 10, 4, 100};

        System.out.println("Before: " + Arrays.toString(nums2));

        for (int i =0; i < nums.length/2; i++){
            int temp2 = nums2[i];
            nums2[i] = nums2[nums.length - 1 -i];
            nums2[nums.length - 1 -i] = temp2;
        }
        System.out.println("After: " + Arrays.toString(nums2));


        String [] word = {"java", "html", "js", "ruby", "css"};
        System.out.println("Before reverse word = " + Arrays.toString(word));

        for (int i =0, j=word.length-1; i <word.length/2; i++, j--){ //java throws decimals out so i=2 after 5/2
            String tempWord = word[i];
            word[i] = word[j];
            word[j] = tempWord;
        }
        System.out.println("words after reverse = " + Arrays.toString(word));


    }
}
