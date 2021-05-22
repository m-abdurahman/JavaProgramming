package day43_list_custom_classes;

import java.util.*;

public class ListMethods {
    public static void main(String[] args) {
        List <String> weekDays = getDays();
        System.out.println(weekDays);
        System.out.println("size = " + weekDays.size());
        System.out.println("size(0) = " + weekDays.get(0));

        //weekDays.removeIf(d -> d.length() == 6);
        //System.out.println("week days after RemoveIf = " + weekDays);


        List<Integer> numbers = getRandomList(10);
        System.out.println("numbers = " + numbers);
        System.out.println("size = " + numbers.size());
        System.out.println("numbers = " + numbers);
        numbers.removeIf(n -> n < 90);
        System.out.println("numbers = " + numbers);
    }


    public static List<String> getDays(){
        List<String> weeks = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
    return weeks;
    }

    public static List<Integer> getRandomList(int size){
        Random random = new Random();
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i<= size; i++){
            nums.add(random.nextInt(101));
        }
        return nums;

    }


}