package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testiNG, maven, cucumber";
        //first comma
        System.out.println(technologies.indexOf(","));
        //last comma
        System.out.println(technologies.lastIndexOf(","));

        int indexOfJava = technologies.indexOf("java");
        System.out.println("Index of java= " + indexOfJava);

        int indexOfCss = technologies.indexOf("css");
        System.out.println("Index of css= " + indexOfCss);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("Index of cucumber= " + indexOfCucumber);

        int indexOfSql = technologies.indexOf("sql");
        System.out.println("Index of SQL= " + indexOfSql);

        if (technologies.contains("maven")) {
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }

        if (technologies.indexOf("maven") > -1) {
            System.out.println("Maven is present");
        }else{
            System.out.println("Maven is not present");


        }
    }
}
