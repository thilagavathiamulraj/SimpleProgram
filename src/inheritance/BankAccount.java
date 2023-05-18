package inheritance;

public abstract class BankAccount {
    double balance = 15000;
    double interestRate;
    abstract String withdraw(String withdrawal);
}

