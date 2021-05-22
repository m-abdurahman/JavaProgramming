package day32_arrays_split;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("----- Print the most expensive item ------");
        double maxPrice = prices[0]; //assume first price in the index is max
        int indexOfMaxPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }
        }
        System.out.println("The most expensive item is " + items[indexOfMaxPrice] + " - $" + prices[indexOfMaxPrice] + " - #" + itemIDs[indexOfMaxPrice]);


        System.out.println("----- Print the least expensive item ------");
        double minPrice = prices[0];
        int indexOfMinPrice = 0;
        for (int n = 0; n < prices.length; n++) {
            if (prices[n] < minPrice) {
                minPrice = prices[n];
                indexOfMinPrice = n;
            }
        }
        System.out.println("The least expensive item is " + items[indexOfMinPrice] + " - $" + prices[indexOfMinPrice] + " - #" + itemIDs[indexOfMinPrice]);
    }
}
