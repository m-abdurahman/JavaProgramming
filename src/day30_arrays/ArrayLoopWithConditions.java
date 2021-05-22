package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};

        //print all numbers from prices array that are more than 100
        System.out.print("---- prices more than $100 ----");
        for (double eachPrices : prices) {
            if (eachPrices > 100.0) {
                System.out.println(eachPrices);            }
        }
        System.out.println("---- prices between $10 & $70 inclusive ----");
        for (double EachPrice : prices){
            if (EachPrice > 10 && EachPrice <70){
                System.out.println(EachPrice);
            }
        }

        System.out.println("\n ---- Count of the prices that are more than $50 ----");
        int count= 0;
        for (double each : prices){
            if (each >50){
                count++;
            }
        }
        System.out.print(count);

        System.out.println("\n ---- Countries with name length more than 7 or more ----");
        for (String countryName : countries){
            if (countryName.length()>=7){
                System.out.println(countryName + "-" + countryName.length() + " ");
            }
        }



    }
}
