package day57_abstraction_polymorphism.abstract_class_vs_interface;
/**
 * concrete- 1st non-abstract class child of abstract class or interface
 */

//class can extend ONE abstract class
//class can implement MULTIPLE interfaces

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB{
    //concrete subclass must override/implement abstract methods from abstract class or interface

    @Override
    public void absMethodA() {
        System.out.println("AbsMethodA implementation is called");
    }

    //Sub class can override/implement non-final(constant) methods from parent class
    @Override
    public void methodB(){
        System.out.println("methodB overridden version is called");
    }

    // @Override -> static methods are hidden
    public static void staticMethodC(){
        System.out.println("staticMethodC hidden version is called");
    }


    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overridden version is called - " + num);
    }
}
