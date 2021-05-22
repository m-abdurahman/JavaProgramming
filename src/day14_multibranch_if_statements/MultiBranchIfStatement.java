package day14_multibranch_if_statements;

public class MultiBranchIfStatement {
    public static void main (String [] args) {
        //WITHOUT MULTIBRANCH
        int day = 3;
        if (day == 1) {
        System.out.println("Monday");
    }else

    {
        System.out.println("Not Monday");
    }
        if (day ==2)

    {
        System.out.println("Tuesday");
    }
        if (day ==3)

    {
        System.out.println("Wednesday");
    }

        //WITH multibranch
        day = 1;
        if (day ==1) {
            System.out.println("Monday");
        }else if (day ==2) {
            System.out.println("Tuesday");
        }else if (day ==3) {
            System.out.println("Wednesday");
        }else{
            System.out.println("Not correct");
        }

    }

}
