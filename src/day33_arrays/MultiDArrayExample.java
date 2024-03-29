package day33_arrays;
import java.util.Arrays;
public class MultiDArrayExample {
    public static void main(String[] args) {
        String [][] users = new String [3][2];  //3 user names & 2 types of info: names & password
        users[0][0] = "Teodora Tsvetanov";
        users[0][1] = "TeodorasPWD12";
        users[1][0] = "Anna Ziyaeva";
        users[1][1] = "AnnaAlmaty123";
        users[2][0] = "Parvin Altae";
        users[2][1] = "ParvinVienna321";

        String [][] userData ={ {"Teodora Tsvetanov", "TeodorasPWD12"},
                                {"Anna Ziyaeva", "AnnaAlmaty123"},
                                {"Parvin Altae","ParvinVienna321" } };
        System.out.println("User names");

        System.out.println(userData[0][0]);
        System.out.println(userData[1][0]);
        System.out.println(userData[2][0]);

        System.out.println("Passwords");

        System.out.println(userData[0][1]);
        System.out.println(userData[1][1]);
        System.out.println(userData[2][1]);

        System.out.println(Arrays.deepToString(userData));
    }
}
