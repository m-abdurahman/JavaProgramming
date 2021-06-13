package day53_inhertance.hiding;

import java.util.concurrent.Callable;

public class Parent {
    public String name = "Parents > Mike Smith";
    public void introduce1(){
        System.out.println("Hello I am " + name);
    }
}

    class Child extends Parent {
        public String name = "Child > Bob Smith";

        public void introduce2() {
            System.out.println("Hello I am " + name);
        }
    }

    class Runner {
        public static void main(String[] args) {
            Parent parent = new Parent();
            parent.introduce1();

            Child child = new Child();
            child.introduce1();
            child.introduce2();



        }
    }
