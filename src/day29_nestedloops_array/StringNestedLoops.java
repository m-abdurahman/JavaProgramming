package day29_nestedloops_array;

public class StringNestedLoops {
    public static void main(String[] args) {
                   // 0123
        String word ="java";
        for (int i=0; i< word.length(); i++){ //OR i<=word.length()-1
            for (int j=0; j<=i; j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }

        System.out.println();

        for (int i=0; i< word.length(); i++){
            for (int j =i; j< word.length(); j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }



    }

}
