package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);

        String strPrice = "123.5";
        double price = Double.parseDouble(strPrice);
        if (price > 100){
            System.out.println(true);

        String sentence = "I wrote 100 lines of java code";
        String [] arr = sentence.split(" ");
        int lineOfCode = Integer.parseInt(arr[2]);
            System.out.println("number in the sentence = " + lineOfCode);


        }
    }
}
