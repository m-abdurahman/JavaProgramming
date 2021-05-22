package OfficeHours.Practice_04_06_2021;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "abcdeee";
        String longestSubString = "";
        String temp = "";

        for (int i = 0; i < str.length(); i++) {

            temp += str.charAt(i);

            if (str.charAt(i) != str.charAt(i + 1)){

                if (temp.length() > longestSubString.length()){
                    longestSubString = temp;
                }

                temp = "";

            }

        }

        System.out.println("Longest substring: " + temp);


    }


}
