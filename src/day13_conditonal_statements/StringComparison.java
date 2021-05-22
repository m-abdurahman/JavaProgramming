package day13_conditonal_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if (city.equals("Los Angeles")) {
            System.out.println("It is Los Angeles");
        }else{
            System.out.println("It is not Los Angeles");
        }

        String weather = "sunny";
        if (weather.equals("sunny")) {
            System.out.println("It is sunny today!");
        }else{
            System.out.println("It is cloudy today");
        }
    }
}
