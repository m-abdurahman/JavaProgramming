package day35_methods_with_parameters;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(7);
        int num = 9;
        count(num);
        String word = "Wooden spoon";
        count(word.length());

        int birthYear =2001;
        printAge(birthYear);

    }
    public static void count(int num){
        for (int i =0; i<=num; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printAge(int year){
        int age = 2021-year;
        System.out.println("Birth year: " + year + ". Age: " + age);

    }
}
