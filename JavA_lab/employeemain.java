
class employee {
    String name;
    int id;
    double salary;
    String department;
    String designation;

    employee(String name, int id, double salary, String department, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.designation = designation;
    }

    employee() {
        this.name = "vinesh";
        this.id = 3292;
        this.salary = 10000;
        this.department = "CSE";
        this.designation = "SDE3";
    }

    employee(employee obj1) {// copy constructor has 2 distinct memory but shares same data
        this.name = obj1.name;
        this.id = obj1.id;
        this.salary = obj1.salary;
        this.department = obj1.department;
        this.designation = obj1.designation;
    }

    void displayDetails() {
        System.out.println("name:" + this.name);
        System.out.println("id:" + this.id);
        System.out.println("salary:" + this.salary);
        System.out.println("department:" + this.department);
        System.out.println("designation:" + this.designation);
    }

    public String toString() {
        return "name:\n" + this.name + "\n" + "id:\n" + this.id + "\n" + "salary:\n" + this.salary + "\n"
                + "department:\n" + this.department + "\n" + "designation:\n" + this.designation;
    }
}

class manager extends employee {
    double bonus;

    manager(String name, int id, double salary, String department, String designation) {
        super(name, id, salary, department, designation);
    }

    manager() {
        super();

    }

    manager(manager obj) {
        super(obj);
        this.bonus = obj.bonus;

    }

    double computeSalary(double bonusAmount) {
        bonus = super.salary + bonusAmount;
        return bonus;
    }

    void newdisplay() {
        super.displayDetails();
        System.out.println("Bonussalary:" + this.bonus);
    }

    public String toString() {
        return "name:\n" + this.name + "\n" + "id:\n" + this.id + "\n" + "salary:\n" + this.salary + "\n"
                + "department:\n" + this.department + "\n" + "designation:\n" + this.designation + "\n"
                + "bonussalary:\n" + this.bonus;
    }

}

class employeemain {
    public static void main(String args[]) {
        employee e1 = new employee();
        manager m1 = new manager();
        m1.computeSalary(600);
        m1.displayDetails();
        System.out.println("----calling the new display-----");
        m1.newdisplay();
        manager m2 = new manager(m1);
        m2.newdisplay();
        System.out.println("calling the to string overriden method");
        System.out.println(e1);
        System.out.println(m2);
    }
}
