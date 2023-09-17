import java.util.*;

abstract class Account {
    String cust_name;
    int cust_id, accnum;
    static int count = 0;

    Account(String cust_name, int cust_id, int accnum) {
        this.cust_name = cust_name;
        this.cust_id = cust_id;
        this.accnum = accnum;
    }

    public abstract double deposit(int cust_id, double money);

    public abstract double withdraw(int cust_id, double money);
}

class SavingAccount extends Account {
    double balance;

    SavingAccount(String cust_name, int cust_id, int accnum, double balance) {
        super(cust_name, cust_id, accnum);
        this.balance = balance;
    }

    public double withdraw(int cust_id, double money) {
        if (this.cust_id == cust_id) {
            if (money < this.balance) {
                count++;
                balance -= money;
                return balance;
            } else {
                return -1;
            }
        } else
            return -1;
    }

    public double deposit(int cust_i, double money) {
        if (this.cust_id == cust_i) {
            count++;
            balance += money;
            return balance;
        } else
            return -1;
    }

    public void transfer(SavingAccount fromacc, SavingAccount toacc, double moneyt) {
        if (fromacc.balance > moneyt) {
            count++;
            fromacc.balance -= moneyt;
            toacc.balance += moneyt;
            System.out.println("Transfered " + moneyt + " from " + fromacc.cust_name + " to " + toacc.cust_name);

        } else
            System.out.println("Transaction failed");
    }

    public void addinterest(double rate) {
        count++;
        double interest = (this.balance * rate) / 100;
        this.balance += interest;
        System.out.println("balance after adding interest" + this.balance);
    }

    public void display() {
        System.out.println("Name:" + this.cust_name);
        System.out.println("Id:" + this.cust_id);
        System.out.println("Account number:" + this.accnum);
        System.out.println("Balance: " + this.balance);
    }
}

class BankDemo {
    public static void main(String args[]) {
        SavingAccount s1 = new SavingAccount("Vinesh", 894, 550055, 10000);
        SavingAccount s2 = new SavingAccount("Varun", 3100, 999422, 20000);
        SavingAccount s3 = new SavingAccount("Vavin", 8310, 3108, 30000);
        int choice;
        double mon;
        Scanner in = new Scanner(System.in);
        System.out.println("1.Display");
        System.out.println("2.Withdraw");
        System.out.println("3.Deposit");
        System.out.println("4.Transfer");
        System.out.println("5.Addinterest");

        System.out.println("Enter your choice");
        do {
            choice = in.nextInt();
            switch (choice) {
            case 1:
                s1.display();
                break;
            case 2:
                System.out.println("enter the money to withdraw");
                mon = in.nextDouble();
                System.out.println(s1.withdraw(894, mon));
                break;
            case 3:
                System.out.println("enter the money to deposit");
                mon = in.nextDouble();
                System.out.println(s1.deposit(894, mon));
                break;
            case 4:
                System.out.println("enter the money to be transfered");
                mon = in.nextDouble();
                s1.transfer(s1, s2, mon);
                break;
            case 5:
                System.out.println("enter the rate of interest ");
                mon = in.nextDouble();
                s1.addinterest(mon);
                break;
            default:
                System.out.println("enter the above mentioned choice");
                break;
            }
        } while (choice != 0);

    }
}