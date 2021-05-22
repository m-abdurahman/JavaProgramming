package day14_multibranch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather ="rainy";
        if (weather.equals("sunny")) {
            System.out.println("Go to park");
        }else if (weather.equals("rainy")) {
            System.out.println("Stay home, drink tea, and code java");
        }else if (weather.equals("snowy")) {
            System.out.println("Clean the car the build snowman");
        }else if (weather.equals("windy")) {
            System.out.println("Get ready for the power loss & fly a kite");
        }else{
            System.out.println("Just keep coding java");
        }
    }
}
