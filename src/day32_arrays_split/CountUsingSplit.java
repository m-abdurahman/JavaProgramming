package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String cats = "bengal cat tabby cat persian cat no cat here";
        String [] countCats = cats.split ("cat");
        System.out.println("number of 'cat' = " + (countCats.length-1));

        for (String type : countCats){
            System.out.println(type);

        }


    }
}
