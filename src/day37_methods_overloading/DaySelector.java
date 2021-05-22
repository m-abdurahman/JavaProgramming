package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(4));
        System.out.println(getDayNamesV2(2));

        for (int i =1; i<=8; i++) {
            System.out.println(i+ "=" + getDayName(i));

            String day = getDayName(1);
            System.out.println("Today's day is " + day);

            String someDay = getDayName(0);
            if (day ==null){
                System.out.println("SomeDay is null for inalid day");
            }
        }
    }

    public static String getDayNamesV2(int day) {
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wedneaday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid day " + day);
                dayName = null;
        }
        return dayName;
    }

    public static String getDayName(int day){
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                System.out.println("ERROR: Invalid day " + day);
                return null;
              }
        }
}

