package day36_methods_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        fullName();
        System.out.println("Full name= " + fullName());
        isMarried();
        System.out.println("Married? " + isMarried());
        getAge();
        System.out.println("Age = " + getAge());
        getRandomYear();
        System.out.println("Year = " + getRandomYear());

        String name =fullName();
        Boolean isMarried = isMarried();
        int age = getAge();
        int year =getRandomYear();

        System.out.println("name = " + name);
        System.out.println("isMarried = " + isMarried);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

        if (isMarried){
            System.out.println("married");
        }else{
            System.out.println("single");
        }
    }
    public static String fullName(){
        return "Mike Smith";
    }

    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        int age = 35;
        return 35;
    }

    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;

    }

}


