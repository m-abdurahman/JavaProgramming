package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        System.out.println(result.substring(13, 18));
        System.out.println(result.substring(13));

        //find the index of ":"
        System.out.println(result.indexOf(":"));

        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex));
        // OR (same as above)
        System.out.println(result.substring(result.indexOf(":")));

        String today = "I learned [cooking] today";
        int start = today.indexOf("[");
        int end = today.indexOf("]");

        System.out.println(today.substring(start+1, end));



    }
}
