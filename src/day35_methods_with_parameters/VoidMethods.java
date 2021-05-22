package day35_methods_with_parameters;

public class VoidMethods {
    public static void main(String[] args) {
        printAtoZ();

        for (int i = 0; i < 10; i++) {
            printAtoZ();
        }
        displayFlag();

    }

        public static void printAtoZ () {
            for (char i = 'A'; i <= 'Z'; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


    public static void displayFlag(){
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}




