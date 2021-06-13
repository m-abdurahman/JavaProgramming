package day53_inhertance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
        //TestData.ADMIN_USERNAME = "Change"; -> ERROR: can't change the value of final variable
        final int SNN = 432123433;
        //SNN = 1234456; //ERROR: can't assign new value

        /**
         * ERROR: can't inherit from final class
         */
        //class Child extends TestData{
        //}

    }
}
