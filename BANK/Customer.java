package customer;

import bank.*;
import accounttypes.*;
import bankexceptions.*;
import java.util.*;

public class Customer {
    public static void main(String args[]) {
        double money, overDl;
        Scanner in = new Scanner(System.in);
        System.out.println("press 1.For savings account");
        System.out.println("press 2.Current Account");
        int choice1 = in.nextInt();
        try {
            if (choice1 == 1) {
                int choice;
                SavingsAccount obj1 = new SavingsAccount(123456, "Vinesh", 4500, 5);
                SavingsAccount obj2 = new SavingsAccount(34564, "Varun", 7000, 2);
                SavingsAccount obj3 = new SavingsAccount(4534, "Vavin", 9000, 3);
                do {
                    System.out.println("1.deposit");
                    System.out.println("2.withdraw");
                    System.out.println("3.Display details");
                    System.out.println("4.calculate interest");
                    System.out.println("5.Transfer");
                    System.out.println("6.Balance enquiry");
                    System.out.println("Enter your choice:");
                    choice = in.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter the amount to be deposited");
                            money = in.nextDouble();
                            obj1.deposit(money);
                            obj1.balanceEnquiry();
                            break;
                        case 2:
                            System.out.println("Enter the amount to withdraw");
                            money = in.nextDouble();
                            System.out.println(obj1.withdraw(money));
                            break;
                        case 3:
                            System.out.println("Details are:");
                            obj1.displayAccountDetails();
                            break;
                        case 4:
                            obj1.calculateInterest();
                            System.out.print("updated balance: ");
                            obj1.balanceEnquiry();
                            break;
                        case 5:
                            System.out.println("Enter the amount to be transfered:");
                            money = in.nextDouble();
                            obj1.transfer(obj2, obj3, money);
                            System.out.println("for 2nd objbal:");
                            obj2.balanceEnquiry();
                            System.out.println("for 3nd objbal:");
                            obj3.balanceEnquiry();

                            break;
                        case 6:
                            obj1.balanceEnquiry();
                            break;
                    }

                } while (choice != 0);

            }

            else if (choice1 == 2) {
                int choice;
                CurrentAccount ob1 = new CurrentAccount(456456, "Vijay", 2999, 4000);
                CurrentAccount ob2 = new CurrentAccount(454335, "Ajay", 2709, 4006);
                CurrentAccount ob3 = new CurrentAccount(456456, "Vijay", 2999, 4000);
                do {
                    System.out.println("1.deposit");
                    System.out.println("2.withdraw");
                    System.out.println("3.Display details");
                    System.out.println("4.Check over draft");
                    System.out.println("Enter your choice:");
                    choice = in.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter the amount to be deposited");
                            money = in.nextDouble();
                            ob1.deposit(money);
                            break;
                        case 2:
                            System.out.println("Enter the amount to be withdrawn");
                            money = in.nextDouble();
                            System.out.println(ob1.withdraw(money));
                            break;
                        case 3:
                            System.out.println("Enter the money to check ODL");
                            money = in.nextDouble();
                            ob1.checkOverdraftLimit(money);
                            break;
                    }
                } while (choice != 0);
            }

        } catch (InvalidAmountException e) {
            System.out.println(e);
        } catch (InsufficientFundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
