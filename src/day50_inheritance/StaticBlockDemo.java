package day50_inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticBlockDemo {
    static int num;

    static {
        System.out.println("static initializer block");
        num = 10;
    }

    public StaticBlockDemo(){
        System.out.println("constructor method");
        num +=5;
    }
}
