class employee {
    String empnme, empid, empdesig;
    double basicpay, netpay;

    employee(String empnme, String empid, String empdesig, double basicpay, double netpay) {
        this.empnme = empnme;
        this.empid = empid;
        this.empdesig = empdesig;
        this.basicpay = basicpay;
        this.netpay = netpay;
    }

    void empUpdate(String name, String id, double bpay, double npay) {
        empnme = name;
        empid = id;
        basicpay = bpay;
        netpay = npay;
    }

    void payBill() {
        double da = (18 * basicpay) / 100;
        double hra = (5 * basicpay) / 100;
        double pf = (8 * basicpay) / 100;
        netpay = basicpay + da + hra - pf;
        System.out.format("calculated netpay is %.3f\n", netpay);
    }

    void display() {
        System.out.println("Name:" + empnme);
        System.out.println("Id:" + empid);
        System.out.println("designation:" + empdesig);

    }

}

class EmpDemo {
    public static void main(String args[]) {
        employee e = new employee("vinesh", "47AZ", "SDE3", 34.5, 77.8);
        e.display();
        e.payBill();
        e.empUpdate("sharan", "57AM", 50.5, 70.8);
        e.display();
        e.payBill();
    }
}