package day38_methods;

public class ArrayUtils {

    public static void printArray(int[] num) {
        for (int eachNum : num) {
            System.out.print(eachNum + " ");
        }
        System.out.println();
    }
    public static int sum (int[] nums){
        int sum = 0;
        for (int eachNUm : nums){
            sum +=eachNUm;
        }
        return sum;
    }

    public static boolean contains (int[] nums, int num){
        boolean found = false;
        for (int each : nums){
            if (each == num){
                found = true;
                break;
            }
        }
        return found;
    }
}
