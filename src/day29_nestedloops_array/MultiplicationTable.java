package day29_nestedloops_array;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int o=1; o<=10; o++){
            for (int i=1; i<=10; i++){
                int result = o*i;
                System.out.print("|\t" + o + "x" + i + "=" + result + "\t");
            }
            System.out.println();
        }
    }
}
