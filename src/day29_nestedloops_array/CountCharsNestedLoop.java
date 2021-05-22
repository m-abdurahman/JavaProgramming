package day29_nestedloops_array;

public class CountCharsNestedLoop {
    public static void main(String[] args) {

        String word = "java";
        for (int o = 0; o <word.length(); o++){
            char outer = word.charAt(o);
            int count =0;
            for (int i = 0; i< word.length(); i++){
                char inner = word.charAt(i);
                if (outer == inner){
                    count++;

                }

            }
            System.out.println(outer + "=" + count);
        }
        System.out.println();

    }
}
