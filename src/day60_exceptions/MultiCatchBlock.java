package day60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        String word = "java";
        //String word= null; //-> will create NullPointerException if word1 is run

        try {
            System.out.println(10/0); //-> arithmathic exception so Throwable exception will be used to catch since its the parent
            System.out.println("word = " + word);
            System.out.println("length = " + word.length());
            System.out.println(word.substring(20)); //this will fail
        }catch (NullPointerException e) {
            System.out.println("NullPointerException caught and handled, please check if String has value");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index is wrong, please check if you've entered a valid index");
        }catch (Throwable t){
            System.out.println("Exception is caught");
            System.out.println("Reason = " + t.getMessage());
        }
        System.out.println("-- more code after try catch --");
    }
}
