package day47_constructors;

public class Student {
    private String name;
    public int age;
    //No-args constructor
    public Student(){
        System.out.println("No-Args constructor");

    }

    //constructor with 1 param: String name
    public Student(String name){
        System.out.println("Name param constructor | name: " + name);
    }

    //constructor with age
    public Student(int age){
        System.out.println("Age param constructor | age: " + age);
    }

    public Student(String name, int age){
        System.out.println("Name & age param constructor | " + name + " - " + age);
    }

}
