class car {
    // instance variables for the car class
    private String name, model, owner, bodystyle;
    int year;

    public car() {// default constructor
        name = "audi";
        model = "Q7";
        year = 2019;
    }

    public car(String name, String model, int year, String bodystyle) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.bodystyle = bodystyle;
    }

    public car(String nam, String model, int year, String owner, String bodystyle) {
        this(nam, model, year, bodystyle);// calls the already defined parametrized constructor
        this.owner = owner;

    }

    public void printdetails() {
        System.out.println("Name:" + this.name);
        System.out.println("Model:" + this.model);
        System.out.println("Year:" + this.year);
        System.out.println("owner:" + this.owner);
        System.out.println("bodystyle:" + this.bodystyle);
    }

    void print() {
        int a = 1;
        int b = 2;
        int res = a + b;
        System.out.println(res);
    }
}

// vehicle is a derived class inherits all the non private members and functions
// of bc(car)
class vehicle extends car {
    // private String bodyStyle;

    vehicle(String namee, String model, String bodyStyle, int year, String owner) {
        super(namee, model, year, owner, bodyStyle);// calling the base class constructor
        // super.printdetails();// access super class methods as well as fields
        // this.bodyStyle = bodyStyle;
    }

    public void details() {
        super.printdetails();// dont use super for calling the methods declared as public

    }

    void print() {
        // super.print();
        System.out.println("hi vinesh iam from vehicle class");
        super.print();
    }
}

class inheritance {
    public static void main(String args[]) {
        vehicle v = new vehicle("BMW", "X1", "sprtive", 2023, "BrV");
        car c = new vehicle("Bmw", "F", "Sport", 2023, "Brv");
        c.print();
        // v.details();
        // v.print();
        // v.print();
        // v.printdetails();
    }
}