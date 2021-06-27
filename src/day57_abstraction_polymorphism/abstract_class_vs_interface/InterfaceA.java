package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA {

    //before Java8, interface was purely abstraction,
    //only abstract methods were allowed
    //public abstract is automatically added, so it's
    //optional to type it: void abstractMethodD (int num) is suffice

    //interfaces can ONLY have PUBLIC STATIC FINAL variables
    public static final String TYPE = "interface"; //ERROR if not public; Interface can ONLY use PUBLIC access modifier for all variables & methods
    double MAX_COUNT = 500; // -> also 'public static final'

    /**
     * Interface  CANNOT have constructors
     */
    //public InterfaceA(){
    //}

    public abstract void absMethodD(int num);

    /**
     *starting from Java8 (jdk 1.8),
     * interface can have static and default methods
     */
    public static void staticMethodE(String str){
        System.out.println("staticMethodE is called with str - " + str);
    }

    //default method- has a body
    public default void defaultMethodF(){
        System.out.println("defaultMethodF is called");
    }

}
