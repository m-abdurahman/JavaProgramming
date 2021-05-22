package day29_nestedloops_array;

public class StarsNestedLoop {
    public static void main(String[] args) {
         for (int outer =1; outer<=5; outer++){
             System.out.println();
             for (int inner =1; inner <=10; inner++){
                 System.out.print("* ");
             }
         }
        System.out.println();

        for (int o=1; o<=10; o++) {
            for (int i = 1; i <= o; i++) {
                System.out.print("* ");
            }
                System.out.println();
            }

        for (int o=1; o<=10; o++) {
            for (int i = 10; i >= o; i--) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
