package day57_abstraction_polymorphism.abstract_class_vs_interface;

public abstract class AbstractA {
    /*
    Abstract class can have abstract, non-abstract & static methods
     */

    /**
     * Abstract classes can have instance & static variables,
     * with all access modifiers
     */

    //In abstract class, all access modifiers are allowed for variables,
    //& static, instance methods
    int num1;
    private double price;
    static int count;
    protected final String type = "abstract";
    public static final String Language = "java";

    //abstract class can have constructors
    public AbstractA(){
        System.out.println("AbstractA constructor");
    }

    //ERROR below: abstract methods can't be private, static or final
    // private abstract void absMethodA();
    // public static abstract void absMethodA();
    // public final abstract void absMethodA();

    public abstract void absMethodA();

    public void  methodB(){
        System.out.println("MethodB called");
    }
    public static void staticMethodC(){
        System.out.println("StaticMethodC called");
    }
}
