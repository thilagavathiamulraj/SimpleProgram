package inheritance;

public class CheckingAccount extends BankAccount {

    double minimumBalance = 5000.00;

    @Override
    String withdraw(String withdrawal) {
        double withdrawalAmount = Double.parseDouble(withdrawal);
        if ((balance - withdrawalAmount) > minimumBalance) {
            return "Amount Withdrawn successfully from CheckingAccount";
        } else {
            return "Withdrawal is not allowed from CheckingAccount";
        }
    }
}