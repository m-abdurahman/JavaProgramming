package day50_inheritance;

/**
 * super class, parent class, base class
 */
public class Person {
    String name;
    int age;

    public void walk(){
        System.out.println("person is walking");
    }

    public void talk(){
        System.out.println(name + " is talking");
    }

    public void work (String job){
        System.out.println("Person is working as " + job);
    }
}
