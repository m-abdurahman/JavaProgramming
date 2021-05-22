package day28_loops;

public class FindingUniqueChars {
    public static void main(String[] args) {
        /**
         * Given a string retrieve and print one unique characters
         */
        String word = "javva";
        String unique="";
        for (int i =0; i< word.length(); i++){
            //System.out.println(word.charAt(i));
            //if word.charAt(i) is not contained in unique, add to unique
            unique.contains(word.charAt(i)+"");
            if (!unique.contains(word.charAt(i)+"")==true){
                unique+=word.charAt(i);
            }
        }
        System.out.println(unique);

    }
}
