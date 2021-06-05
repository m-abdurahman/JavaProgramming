package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1 = new StaticBlockDemo(); //SIB (10) -> constructor (15)
        StaticBlockDemo st2 = new StaticBlockDemo(); //constructor (15 +5)
        StaticBlockDemo st3 = new StaticBlockDemo(); //(15+5+5)

        System.out.println(StaticBlockDemo.num);


    }
}
