package day39_wrapper_classes;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        //auto-boxing
        int num1 = 500;
        Integer num2 = num1;
        Integer num3 = 234;

        //un-boxing

        Double d1 = new Double(100.5);
        double d2 = d1;
        double d3 = new Double(345.3);
    }
}