package day47_constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student st1 = new Student(); //runs NAC
        Student st2 = new Student(); //it'd print out NAC twice of same NAC (new prints new values each time)

        Student st3 = new Student("Burak");
        Student st4 = new Student("Alihan");
        Student st5 = new Student("Nasiba", 14);

    }
}
