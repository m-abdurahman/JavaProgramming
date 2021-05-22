package day38_methods;
public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isNullOrEmpty (\"hello\") " + isNullOrEmpty("hello"));
        String word = null;
        System.out.println(word.toUpperCase());

        System.out.println("isNullOrEmpty = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));

        System.out.println(isPalindrome("civic"));

    }

    public static boolean isNullOrEmpty(String str){
        if (str == null || str.isEmpty()){
            return true;
        }
            return false;
        }

        public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        for (int i =0; i< str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length() -1 -i)){
                return false;
            }
        }
                return true;
        }

        public static String reverse (String str){
        String reversed = "";
        for (int i =str.length()-1; i >= 0; i--){
            reversed+=str.charAt(i);

            }
            return reversed;

        }


        }


