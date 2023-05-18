package inheritance;

public class SavingsAccount extends BankAccount {

    double minimumBalance = 5000.00;
     String withdraw(String withdrawal) {
        double withdrawalAmount = Double.parseDouble(withdrawal);
        if ((balance - withdrawalAmount) > minimumBalance) {
            return "Amount Withdrawn successfully from SavingsAccount";
        } else {
            return "Withdrawal is not allowed from SavingsAccount";
        }
    }
}



