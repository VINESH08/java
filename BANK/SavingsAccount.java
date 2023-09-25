package accounttypes;

import bank.*;
import bankexceptions.InsufficientFundsException;
import bankexceptions.InvalidAmountException;

public class SavingsAccount extends BankAccount implements Transaction {
    double interestRate;

    public SavingsAccount(int acc, String accname, double bal, double interestRate) {
        super(acc, accname, bal);
        this.interestRate = interestRate;
    }

    public void displayAccountDetails() {
        System.out.println("Account number is: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest rate: " + interestRate);
    }

    public void deposit(double money) throws InvalidAmountException {
        if (money <= 0)
            throw new InvalidAmountException("The money value must be greater than zero");
        balance += money;
    }

    public double withdraw(double money) throws InsufficientFundsException, InvalidAmountException {
        if (balance < money)
            throw new InsufficientFundsException("Insufficient balance!!");
        else if (money <= 0)
            throw new InvalidAmountException("The money value must be greater than zero");

        balance -= money;
        return balance;
    }

    public void calculateInterest() {
        balance = balance + (interestRate * balance);
    }

    public void transfer(SavingsAccount fromacc, SavingsAccount toacc, double money) throws InsufficientFundsException {
        if (fromacc.balance < money)
            throw new InsufficientFundsException();
        fromacc.balance -= money;
        toacc.balance += money;
        System.out.println(
                "Transfered " + money + " from " + fromacc.accountHolderName + " to " + toacc.accountHolderName);

    }

    public void balanceEnquiry() {
        System.out.print("The balance is:");
        System.out.println(balance);
    }

}
