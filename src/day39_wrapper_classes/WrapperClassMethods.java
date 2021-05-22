package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(5,2));
        System.out.println("Minimum integer: " + Integer.MIN_VALUE);
        System.out.println("Maximum integer: " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.4,23.9));
        System.out.println("Maximum double: " + Double.MAX_VALUE);
        System.out.println("Minimum double: " + Double.MIN_VALUE);

        System.out.println(Double.compare(5,1)); //1 = first value is larger
        System.out.println(Double.compare(5,5)); //0 = both values are equal
        System.out.println(Double.compare(5,45)); //-1 = first value is smaller than the second

        System.out.println(Character.isDigit('8')); //tells if value is numbers
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('Q'));
        System.out.println(Character.isLetter('r')); //tells if value is a letter
        System.out.println(Character.isLetter('9'));
        char letter = 'A';
        if(Character.isUpperCase(letter)){
            System.out.println("It is uppercase");
        }

        String word = "jaVa iS FuN";
        for (int i =0; i<word.length(); i++){
            if (Character.isLowerCase(word.charAt(i))){
                System.out.print(word.charAt(i));
            }
        }
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        System.out.println(Boolean.TRUE);



    }
}
