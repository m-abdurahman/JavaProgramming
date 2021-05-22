package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(RepeatString("hi", 3, '|'));
    }
    public static String RepeatString(String word, int times, char delimiter) {
        String retValue = "";
        for (int i = 1; i <= times; i++) {
            if (i == times) {
                retValue += word;
            } else {
                retValue += word + delimiter;
            }
        }
        return retValue;

    }

    }