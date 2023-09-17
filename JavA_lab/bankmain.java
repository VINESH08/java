import java.util.*;

abstract class Account {
    abstract void display();

    protected int accnumber;
    protected double balance;

    Account(int acc, double bal) {
        this.accnumber = acc;
        this.balance = bal;
    }
}

class SBAccount extends Account {
    SBAccount(int acc, double bal) {
        super(acc, bal);
    }

    public double deposit(double money) {
        super.balance = super.balance + money;
        return super.balance;
    }

    public double withdraw(double money) {
        if (money > super.balance) {
            System.out.println("insufficient balance in your account");
        } else {
            super.balance = super.balance - money;
        }
        return super.balance;
    }

    public void cal_interst() {
        double interset = (super.balance * (1.5 / 100) * 30) / 365;
        System.out.println("interest of 1.5% calculated for one year is:" + interset);
    }

    void display() {
        System.out.println("Account number:" + accnumber);
        System.out.println("remaining Balance after transaction:" + balance);
    }
}

class Customer {
    int cust_id, acc, choice;
    double bal;
    String name, address;
    Scanner in = new Scanner(System.in);
    SBAccount obj;

    void getdetails() {
        System.out.println("enter your name:");
        name = in.nextLine();
        System.out.println("enter your id:");
        cust_id = in.nextInt();

        System.out.println("enter your address:");
        address = in.next();
        System.out.println("enter your account number:");
        acc = in.nextInt();
        System.out.println("enter your balance :");
        bal = in.nextDouble();
        obj = new SBAccount(acc, bal);
        System.out.println("enter 1 to withdraw:");
        System.out.println("enter 2 to deposit:");
        choice = in.nextInt();
    }

    void calculate(double money) {
        if (choice == 1) {
            obj.withdraw(money);
            obj.cal_interst();
            obj.display();
        } else if (choice == 2) {
            obj.deposit(money);
            obj.cal_interst();
            obj.display();

        }

    }

}

class bankmain {
    public static void main(String args[]) {
        System.out.println("enter the number of customer:");
        Scanner in = new Scanner(System.in);
        int num;
        double mone;
        num = in.nextInt();
        Customer cus[] = new Customer[num];
        for (int i = 0; i < num; i++) {
            cus[i] = new Customer();
            System.out.println("enter the amount to withdraw or deposit");
            mone = in.nextDouble();
            cus[i].getdetails();
            cus[i].calculate(mone);
        }

    }
}
