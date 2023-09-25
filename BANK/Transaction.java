package bank;

import bankexceptions.*;

public interface Transaction {
    void deposit(double money) throws InvalidAmountException;

    double withdraw(double money) throws InsufficientFundsException, InvalidAmountException;
}
