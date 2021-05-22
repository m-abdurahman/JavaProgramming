package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 6;
        if (floorNum == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        }else if (floorNum ==2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        }else if (floorNum ==3) {
            System.out.println("Floor 3 selected. Companies: Bank of America, Lyft, Stake House");
        }else {
            System.out.println("Invalid floor- "+ floorNum);
        }

        //SWITCH STATEMENT

        floorNum = 3;
        switch(floorNum){
            case 1:               // Same as if
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;            // =exist switch statement
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Bank of America, Lyft, Stake House");
                break;
            default:
                System.out.println("Invalid floor- " +floorNum);



        }

    }
}
