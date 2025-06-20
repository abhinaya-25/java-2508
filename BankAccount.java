
public class BankAccount {
    String accountNumber = "123456789";
    String accountHolder = "Anjana";
    double balance = 1000.00;
    int depositAmount = 500;
    int withdrawAmount = 200;
    int numberOfTransactions = 2;


    // Arithmetic: Update the balance after deposit and withdrawal.
    public void updateBalance() {
        balance += depositAmount;
        balance -= withdrawAmount;
    }

    // Relational: Check if balance is below minimum threshold.
    public boolean isBalanceBelowMinimum() {
        double minimumBalance = 100.00;
        return balance < minimumBalance;
    }

    // Logical: Verify if deposit is valid and account is active.
    public boolean isDepositValid() {
        boolean isActive = true;
        return depositAmount > 0 && isActive;
    }

    // Increment: Increase number of transactions with each operation.
    public void incrementTransactions() {
        numberOfTransactions++;
    }

    // Print Account holder name, Final balance, Number of transactions
    public void printAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Final Balance: " + balance);
        System.out.println("Number of Transactions: " + numberOfTransactions);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.updateBalance();
        account.incrementTransactions();
        account.printAccountDetails();
    }
}