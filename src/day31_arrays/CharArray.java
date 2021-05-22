package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char [] letters ={'j','a','v','a', ' ', 'i', 's', ' ', 'f','u','n'};

        for (char eachLetter : letters){
            System.out.print(eachLetter + " ");

        }

        String sentence = new String (letters);
        System.out.println("\nsentence = " + sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println(itemArray);
        System.out.println("itemArray= " + itemArray.length);    //<- array, hence no ()
        System.out.println("item.length() = " + item.length());//<- () method for string class


                // index=       0         1        2       3         4            5
        String [] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};

        //print each fruits with - in between
        String fruitStr = "";
             for (String eachFruits : fruits){
                 System.out.print(eachFruits + " - ");
                 fruitStr +=eachFruits + "-";
             }
        System.out.println("\n fruiStr= " + fruitStr);

             String [] languages = {"java", "python", "c++", "ruby"};
        System.out.println(String.join("|", languages));

        String str ="git";

        str.toCharArray();

        char[] letter = str.toCharArray();



    }
}
