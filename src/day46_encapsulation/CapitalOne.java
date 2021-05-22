package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();

        account.setBalance(3523.45D);
        System.out.println("Account Balance = " + account.getBalance());

        account.setAccountNumber(1234567890);
        System.out.println("Account Number = " + account.getAccountNumber());

        account.setAccountHolder("Anthony Hopkins");
        System.out.println("Account Holder = " + account.getAccountHolder());

        account.setType("Checking type");
        System.out.println("Account type = " + account.getType());

        System.out.println(account.toString());
        System.out.println(account);




    }
}
