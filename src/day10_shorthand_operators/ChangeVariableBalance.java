package day10_shorthand_operators;

public class ChangeVariableBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);

        balance = balance - baklava;
        System.out.println("Balance is $" + balance);
        
        double kunefe = 44.45;
        System.out.println("Kunefe = " + kunefe);
        
        balance = balance - kunefe;
        System.out.println("balance = " + balance);
        
        kunefe = kunefe / 2;
        System.out.println("kunefe = " + kunefe);
        
        balance = balance - kunefe;
        System.out.println("balance after second kunefe = $" + balance);
        
        double plov = 7.99;
        System.out.println("plov = " + plov);

        balance = balance - plov;
        System.out.println("balance after the plov = $" + balance);
        
        double icedTea = 3.0;
        System.out.println("icedTea = " + icedTea);

        icedTea = icedTea * 4;
        balance = balance - icedTea;
        System.out.println("Balance after iced tea= $" + balance);

        // return baklava
        balance = balance + baklava;
        System.out.println("Returning baklava = $" + balance);

        int n = 5;
        n = n + 3;

    }
}
