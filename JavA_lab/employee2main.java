package JavA_lab;

class employee {
    private String name;
    int id;
    double salary;
    String department;
    String designation;

    public employee(String name, int id, double salary, String department, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.designation = designation;
    }

    public employee() {
        this.name = "vinesh";
        this.id = 3292;
        this.salary = 10000;
        this.department = "CSE";
        this.designation = "SDE3";
    }

    public employee(employee obj1) {// copy constructor has 2 distinct memory but shares same data
        this.name = obj1.name;
        this.id = obj1.id;
        this.salary = obj1.salary;
        this.department = obj1.department;
        this.designation = obj1.designation;
    }

    String getname() {
        return name;
    }

    int getid() {
        return id;
    }

    double getsalary() {
        return salary;
    }

    String getdepartment() {
        return department;
    }

    String getdesignation() {
        return designation;
    }

    public void displayDetails() {
        System.out.println("name:" + getname());
        System.out.println("id:" + getid());
        System.out.println("salary:" + getsalary());
        System.out.println("department:" + getdepartment());
        System.out.println("designation:" + getdesignation());
    }

    public String toString() {
        return "name:\n" + getname() + "\n" + "id:\n" + getid() + "\n" + "salary:\n" + getsalary() + "\n"
                + "department:\n" + getdepartment() + "\n" + "designation:\n" + getdesignation();
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

    double getbonus() {
        return bonus;
    }

    double computeSalary(double bonusAmount) {
        bonus = super.salary + bonusAmount;
        return bonus;
    }

    void newdisplay() {
        System.out.println("name:" + super.getname());
        System.out.println("id:" + super.getid());
        System.out.println("salary:" + super.getsalary());
        System.out.println("department:" + super.getdepartment());
        System.out.println("designation:" + super.getdesignation());
        System.out.println("Bonussalary:" + getbonus());
    }

    public String toString() {
        return "name:\n" + super.getname() + "\n" + "id:\n" + super.getid() + "\n" + "salary:\n" + super.getsalary()
                + "\n" + "department:\n" + super.getdepartment() + "\n" + "designation:\n" + super.getdesignation()
                + "\n" + "bonussalary:\n" + getbonus();
    }

}

class employee2main {
    public static void main(String args[]) {
        employee e1 = new employee();
        manager m1 = new manager("Vijay", 1234, 1000, "CSE", "SDE1");
        m1.computeSalary(600);
        m1.displayDetails();
        System.out.println("----calling the new display-----");
        m1.newdisplay();
        manager m2 = new manager(m1);
        m2.newdisplay();
        System.out.println("calling the to string overriden method");
        System.out.println(e1);
        System.out.println(m1);
    }
}
