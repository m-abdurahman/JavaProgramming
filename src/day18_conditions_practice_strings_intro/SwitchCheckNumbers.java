package day18_conditions_practice_strings_intro;

public class SwitchCheckNumbers {
    public static void main(String[] args) {
        /*
        int num1 = 20;
int num2 = 10;

switch(num1) {
    case 10:
        num1++;
        num2+=10;
        break;
    case 20:
        num1+=num2;
        num2--;
    case 30:
        num1 = 0;
        num2 -= 3;
        break;
}
         */

        int num1= 20;
        int num2 = 10;
        switch (num1){
            case 10:
                num1++; //11
                num2+=10; //20
                break;
            case 20:
                num1+=num2; //30
                num2--; //9
                        // Since there were no breaks, the statement keeps going
            case 30:
                num1 = 0; //num1 from previous case changes from 30 to 0
                num2 -= 3; //num2 from previous case decreases 3 times from 9 to 6
                break;
        }
        System.out.println("num1= " + num1);
        System.out.println("num2= " + num2);
    }
}
