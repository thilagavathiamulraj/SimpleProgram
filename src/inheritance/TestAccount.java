package inheritance;

public class TestAccount {
    public static void main(String[] args) {
        BankAccount account = new CheckingAccount();
        System.out.println(account.withdraw(args[0]));
    }
}
