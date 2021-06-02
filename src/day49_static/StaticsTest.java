package day49_static;

public class StaticsTest {
    static String word = "java"; //has to have static to be able to be called if its not under static class
    public static void main(String[] args) {
        //1. static method can be called using className.methodName
        StaticMethods.displayMessage("Wooden spoon");
        // instance method needs an object to be called
        //ERROR: StaticMethods.instanceMethod();
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        //2. static method can only access other static variables & method
        System.out.println(word);

    }
}
