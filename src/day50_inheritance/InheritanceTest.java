package day50_inheritance;

import java.util.ArrayList;

/**
 * sub class, child class, derived class
 */
public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Miya";
        p1.age = 24;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "Saim";
        t1.age =25;
        t1.talk();
        t1.walk();
        t1.teach("java inheritance");

        Student st1 = new Student();
        st1.name = "Miya";
        st1.age = 28;
        st1.talk();
        st1.walk();
        st1.work("Java programmer");
        st1.school = "Cybertek School";
        st1.study("java inheritance");

    }
}
