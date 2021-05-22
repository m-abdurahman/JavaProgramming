package day13_conditonal_statements;

public class ATMPinCodeProgram {
    public static void main(String[] args) {
        System.out.println("**** WELCOME TO TD BANK ATM***");
        System.out.println("Please enter your pincode");
        int inputPincode = 1234;
        int secretPinCode = 1234;
        if (secretPinCode == inputPincode){
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw, check balance, deposit");
        }if (secretPinCode == inputPincode){
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw, check balance");
        }else{
            System.out.println("Incorrect pincode!");
            System.out.println("Please try again.");

        }
    }
}
