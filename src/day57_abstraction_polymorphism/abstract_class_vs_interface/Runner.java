package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {
        //ERRORS below: can't create objects
        // AbstractA abstractA = new AbstractA();
        // InterfaceA interfaceA = new InterfaceA();

        InterfaceA.staticMethodE("wooden spoon");
        //ConcreteA.staticMethodE("hello"); -> staticMethodE ONLY works with interface.staticMethodE
        ConcreteA.staticMethodC();


    }
}
