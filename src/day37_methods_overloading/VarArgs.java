package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(100,200,300);
        addNumbers(45,54,23,45,3,35,4,6,556,3,4,23,35,6);
        addNumbers();
    }
    public static void addNumbers(int... num) {
        int sum = 0;
        for (int n : num){
            sum += n;
        }
        System.out.println("sum = " + sum);
    }

}
