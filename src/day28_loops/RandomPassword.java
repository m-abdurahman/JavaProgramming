package day28_loops;
import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {
        Random random = new Random();
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz" +
                "0123456789_!@#$%^&*";
        String password ="";
        String word = "";

        for (int i =0;i<=8; i++){
            int index = random.nextInt(source.length()); //random # o-70 index #
            System.out.print(source.charAt(index));
            //source.substring(index, index+1) same as above (charAt)
            //System.out.println(random.nextInt(source.length()));
            password += source.charAt(index); //add the char to password variable using +=

        }
        System.out.print("\nYour password= " + password);



    }
}
