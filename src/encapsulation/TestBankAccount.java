package encapsulation;



public class TestBankAccount {

    //Create a class called BankAccount that has private variables
    // accountNumber,balance,customerName.
    // Create public methods to access and modify these variables,
    // getAccountNumber(), getBalance(), getCustomerName(), setAccountNumber(), setBalance(), and setCustomerName().


    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(1);
        bankAccount.setBalance(10);
        bankAccount.setCustomerName("James");
        System.out.println( bankAccount.getAccountNumber());
        System.out.println( bankAccount.getBalance());
        System.out.println( bankAccount.getCustomerName());

    }

}





