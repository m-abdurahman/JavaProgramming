package day38_methods;

public class ArrayUtilTest {
    public static void main(String[] args) {

        int [] nums = {5,23,1,543,90};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[] {23,64,32,59,45,234}); //shortcut/all in single line

        int [] num2 = {4,1,5,8};
        int num = 5;
        boolean found =false;

        for (int each: num2){
            if (each == num){
                found =true;
                break;
            }
        }
        System.out.println("found = " + found);


        System.out.println("sum = " + ArrayUtils.sum(nums));
        System.out.println("sum = " + ArrayUtils.sum(new int[] {23,64,32,59,45,234}));

        int [] nums2 = {4,1,5,8};
        System.out.println("5- found = " + ArrayUtils.contains(num2,5));
        System.out.println("10 - found = " + ArrayUtils.contains(num2, 10));


    }
}
