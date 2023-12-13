import java.util.*;

abstract class EmployeeData {
    String name, department;
    int da, hra, pf, lic;
    double basicpay;

    EmployeeData(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public abstract void getdetails();

    public abstract void calculateSal();

    public abstract void display();
}

class Employee extends EmployeeData {
    String designation;
    double grosspay, netpay;
    Scanner in = new Scanner(System.in);

    Employee(String name, String department, String designation) {
        super(name, department);
        this.designation = designation;
    }

    public void getdetails() {
        System.out.println("enter the da%:");
        da = in.nextInt();
        System.out.println("enter the hra%:");
        super.hra = in.nextInt();
        System.out.println("enter the pf%:");
        super.pf = in.nextInt();
        System.out.println("enter the lic%:");
        super.lic = in.nextInt();
        System.out.println("enter the Basic pay:");
        super.basicpay = in.nextDouble();
    }

    public void calculateSal() {

        grosspay = super.basicpay + super.da + super.hra;
        netpay = grosspay - (super.pf + super.lic);
        System.out.println("GrossPay is:" + grosspay);
        System.out.println("NetPay is:" + netpay);
    }

    public void display() {
        System.out.println("Name:" + name);
        System.out.println("Department:" + department);
        System.out.println("Basicpay:" + basicpay);
        System.out.println("Grosspay:" + grosspay);
        System.out.println("Netpay:" + netpay);
    }

}

class EmployeeDat {
    public static void main(String args[]) {
        int num;
        System.out.println("enter the total number of employees:");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        Employee ep[] = new Employee[num];
        for (int i = 0; i < num; i++) {
            System.out.println("enter the name:");
            String name = in.next();
            System.out.println("enter the department:");
            String depart = in.next();
            System.out.println("enter the designation");
            String desig = in.next();
            ep[i] = new Employee(name, depart, desig);
            ep[i].getdetails();
            ep[i].calculateSal();
            ep[i].display();
        }
    }
}