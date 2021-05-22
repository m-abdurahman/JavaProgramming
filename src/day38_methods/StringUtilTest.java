package day38_methods;
/*
//import all static methods so you can just call by its method names
 */
import static day38_methods.StringUtils.*;
public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if (StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL: username can't be null or empty");
        }

        System.out.println("isPalindrome (civic) = " + StringUtils.isNullOrEmpty("civic"));
        System.out.println("isPalindrome (kayak) = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome (cybertek) = " + isPalindrome("cybertek"));


        String word = "Sunday";
        String reversed = StringUtils.reverse(word);
    System.out.println("word = " + word);
        System.out.println("Reversed = " + reverse(word));

    }
}
