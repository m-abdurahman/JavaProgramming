package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("word count = " + word.length());
        System.out.println("Wooden spoon".length());

        String firstName = "Miya";
        System.out.println(firstName + " - " + firstName.length());
        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "abc123";

        if (password.length() >=6) {
            System.out.println("valid Amazon password");
        }else{
            System.out.println("password too short");
        }
    }
}
