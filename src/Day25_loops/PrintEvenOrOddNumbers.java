package Day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("print even numbers");
        for (int n =1; n <=100; n++){
          if (n %2 ==0) {
              System.out.print(n + " ");
          }
    }
        System.out.println();
        System.out.println("Print odd numbers");
        for (int k =0; k<=100; k++){
            if (k %2 !=0){ // OR ==1
                System.out.print(k + " ");
            }
        }

    }


}
