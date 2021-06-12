package day50_inheritance;

public class Student extends Person{
        //student IS-A Person
    String school;
        public void study(String topic) {
            System.out.println(name + " is studying " + topic + " at "+ school);

        }
}
