package bank;

public abstract class BankAccount {
    public int accountNumber;
    public String accountHolderName;
    public double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void displayAccountDetails();
}