package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};
        for (int eachData : data){
            System.out.print(eachData + " ");
        }

        //repeat above with for loop
        System.out.println();
        for (int i=0; i<data.length; i+=2){
            System.out.print(data[i]);

        }

        //print last value in array using length
        System.out.println();
        System.out.println("last value: " + data[data.length -1]);

        //print all numbers backwards
        for (int i= data.length-1; i>=0; i--)
        System.out.print(data[i] + " ");
    }
}
