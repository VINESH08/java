class Account {
    int balance;
    int accNumb;

    void displayBalance() {
        System.out.println("AccountNumber:" + accNumb + " Balance:" + balance);
    }

    public synchronized void deposit(int money) {
        balance = balance + money;
        System.out.println("Deposited:" + money);
        displayBalance();
        notify();
    }

    public synchronized void withdraw(int money) {
        if (balance < money)
            try {
                System.out.println("Waiting for deposit!!!");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        balance = balance - money;
        System.out.println("Withdrawn:" + money);
        displayBalance();

    }
}

class TransactionDeposit extends Thread {
    Account acc;
    int money;

    TransactionDeposit(Account acc, int money) {
        this.acc = acc;
        this.money = money;
    }

    public void run() {
        acc.deposit(money);
    }
}

class Transactionwithdraw extends Thread {
    Account acc;
    int money;

    Transactionwithdraw(Account acc, int money) {
        this.acc = acc;
        this.money = money;
    }

    public void run() {
        acc.withdraw(money);
    }
}

class BankSynchro {
    public static void main(String[] args) {
        Account obj = new Account();
        TransactionDeposit t1 = new TransactionDeposit(obj, 1500);
        Transactionwithdraw t2 = new Transactionwithdraw(obj, 1000);
        t2.start();
        t1.start();
    }
}
