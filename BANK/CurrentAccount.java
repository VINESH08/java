package accounttypes;

import bank.*;
import bankexceptions.*;

public class CurrentAccount extends BankAccount implements Transaction {
    double overdraftLimit;

    public CurrentAccount(int acc, String accname, double bal, double overdraftLimit) {
        super(acc, accname, bal);
        this.overdraftLimit = overdraftLimit;
    }

    public void displayAccountDetails() {
        System.out.println("Account number is: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest rate: " + overdraftLimit);
    }

    public void deposit(double money) throws InvalidAmountException {
        if (money <= 0)
            throw new InvalidAmountException("The money value must be greater than zero");
        balance += money;
        System.out.println("Balance: " + balance);
    }

    public double withdraw(double money) throws InsufficientFundsException, InvalidAmountException {
        if (balance < money)
            throw new InsufficientFundsException("Insufficient balance!!");
        else if (money <= 0)
            throw new InvalidAmountException("The money value must be greater than zero");

        balance -= money;
        return balance;
    }

    public void checkOverdraftLimit(double money) {
        if (money > overdraftLimit)
            System.out.println("Exceding overdraft limit!!");
    }

}
