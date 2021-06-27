package day57_abstraction_polymorphism.abstract_class_vs_interface;

import java.io.Serializable;

//interface can EXTEND another interface
//interface supports multiple inheritances via 'extends'
//When it extends another interface, child interface is not responsible
//to override another methods.
//concrete sub class will be responsible to override all abstract methods

public interface InterfaceB extends InterfaceA, Serializable, Cloneable {
}
