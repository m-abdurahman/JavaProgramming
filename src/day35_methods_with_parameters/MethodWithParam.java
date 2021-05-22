package day35_methods_with_parameters;

public class MethodWithParam {
    public static void main(String[] args) {
        displayValue(10);
        displayValue(5);
        int count =55;
        displayValue(count);
        greetByName("Joe");

    }
    public static void displayValue(int num){
        System.out.println("Value is " + num);
    }
    public static void greetByName(String name){
        System.out.println("Hello " + name + ", how are you today?");

    }
}
