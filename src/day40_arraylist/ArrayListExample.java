package day40_arraylist;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
        System.out.println("size = " + nums.size());

        //reading from Arraylist
        System.out.println("Index = " + nums.get(0));
        System.out.println("Index = " + nums.get(1));
        System.out.println("Index = " + nums.get(2));
        //System.out.println("Index = " + nums.get(3)); OUT OF BOUND EXCEPTION

        System.out.println(nums);

        nums.remove(1);
        System.out.println(nums);


    }
}
