package day41_arraylist;

import java.util.*;

public class UpdatingArrayList {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Mazda");
        myCars.add("Ford");
        myCars.add("Honda");
        myCars.add(0, "Jeep");
        myCars.add(1, "Kia");
        myCars.add(2, "Acura");
        System.out.println(myCars.toString());
        String allCarsIn1Str = myCars.toString();
        System.out.println(allCarsIn1Str);

        myCars.set(0, "BMW");
        System.out.println(myCars.toString());

        myCars.set(1, "Nissan");
        System.out.println(myCars.toString());

        /**
         * String str = "java";
         * str.index("v") -> 2
         */

        System.out.println("index of Ford = " + myCars.indexOf("Ford"));

        int HondaIndex = myCars.indexOf("Honda");
        System.out.println("Index of Honda = " + HondaIndex);

        myCars.set(HondaIndex, "Subaru");
        System.out.println("After set to Subaru = " + myCars);

        /**
         * if myCar contains "Acura", set value to "Kia", other wise, print Acura is not found"
         */

        if (myCars.contains("Acura")){
            myCars.set(myCars.indexOf("Acura"), "Kia");
        }else{
            System.out.println("Acura was not found");
        }
        System.out.println("After set Kia = " + myCars);

        for (int i=0; i<myCars.size(); i++){
            if(myCars.get(i).equals("BMW")){
                myCars.set(i, "Audi");
            }else if(myCars.get(i).equals("Toyota")){
                myCars.set(i, "Lexus");
            }else if (myCars.get(i).equals("Ford")){
                myCars.set(i, "Tesla");
            }
        }
        System.out.println(myCars.toString());

    }
}