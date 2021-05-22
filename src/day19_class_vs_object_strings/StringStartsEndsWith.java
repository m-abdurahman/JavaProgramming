package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("intellij idea"));
        System.out.println("java".startsWith("j"));

        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));

        String name = "Irina";
        if (name.endsWith("a")) {
            System.out.println("Usually a it's a female name");
        }

        String firstName = "Mrs. Nadir";
        if (firstName.startsWith("Mr.")) {
            System.out.println("Man");
        } else if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Mrs")) {
            System.out.println("Married woman");
        } else if (firstName.startsWith("Ms.")) {
            System.out.println("Single woman");
        } else if (firstName.startsWith("Sr.")) {
            System.out.println("Senior");
        } else if (firstName.startsWith("Jr.")) {
            System.out.println("Junior");
        } else {
            System.out.println("Normal name");
        }

        String url = "http://www.stackoverflow.com";

        if (url.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if (url.endsWith(".gov")) {
            System.out.println("Government website");
        } else if (url.endsWith(".edu")) {
            System.out.println("Education website");
        }else if (url.endsWith(".org")) {
            System.out.println("Organization website");
        }else{
            System.out.println("Invalid url");

        }
    }
}
