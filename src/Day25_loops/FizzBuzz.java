package Day25_loops;

public class FizzBuzz {
    public static void main (String [] args){
        System.out.println("Fizz buzz");
    for (int fb=0; fb<=100; fb++) {
        if (fb % 3 == 00 && fb % 5 == 0) {
            System.out.print(fb + " ");
        }
    }
        System.out.println();
        System.out.println("Fizz");
        for (int f =0; f<=100; f++) {
        if (f % 3 == 0) {
            System.out.print(f + " ");
        }
    }
        System.out.println();
        System.out.println("Buzz");
    for ( int b=0; b<=100; b++){
        if (b % 5 ==0){
            System.out.print(b + " ");
        }
    }

    }
}
