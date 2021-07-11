package day61_exceptions_collections;

public class ElementaryStudentTest {
    public static void main(String[] args) {
        try {
            ElementaryStudent el1 = new ElementaryStudent();
            el1.setName("Bob");
            el1.setAge(1);
            System.out.println(el1.toString());
        } catch (Exception e) {
            e.printStackTrace(); //prints error stack trace & continue (red message) does not stop code

        }

        System.out.println("--- EXECUTION COMPLETE ---");

        throw new BreakTimeException();
    }
}
