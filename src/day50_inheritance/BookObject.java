package day50_inheritance;

public class BookObject {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Intro to java";
        b1.author = "J. Smith";
        b1.type = "programming";
        b1.price = 85.0;

        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.type);
        System.out.println(b1.price);

        AudioBook ab1 = new AudioBook();
        ab1.author = "S. Umesh";
        ab1.length = 60;
        ab1.narrator = "Irina Roman";
        ab1.price = 44.99;
        ab1.title = "Selenium cookbook";
        ab1.type = "automation";
        ab1.listen();

        EBook eb1 = new EBook();
        eb1.author = "F. Savitch";
        eb1.price = 67.99;
        eb1.title = "Java Data Structures";
        eb1.type = "programming";
        eb1.readBook();


    }
}
