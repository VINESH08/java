class vehicle {
    String name;
    String brand;
    int vehiclenum;
    int speed;
    String color;

    public vehicle(String name, String brand, int vehiclenum, int speed, String color) {
        this.name = name;
        this.brand = brand;
        this.vehiclenum = vehiclenum;
        this.speed = speed;
        this.color = color;
    }

    public void showDetails() {
        System.out.println("name:" + name);
        System.out.println("brand:" + brand);
        System.out.println("vehiclenum:" + vehiclenum);
        System.out.println("speed:" + speed);
        System.out.println("color:" + color);
    }
}

class Car extends vehicle {
    int num_wheels;

    Car(String name, String brand, int vehiclenum, int speed, String color, int num_wheels) {
        super(name, brand, vehiclenum, speed, color);
        this.num_wheels = num_wheels;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Number of wheels in car:" + this.num_wheels);
    }
}

class bike extends vehicle {
    int num_wheels;

    bike(String name, String brand, int vehiclenum, int speed, String color, int num_wheels) {
        super(name, brand, vehiclenum, speed, color);
        this.num_wheels = num_wheels;
    }

    public boolean isGeared() {
        System.out.println("The bike is not geared:(bike class)");
        return false;
    }

}

class gearedbike extends bike {
    int gearratio;

    gearedbike(String name, String brand, int vehiclenum, int speed, String color, int num_wheels, int gearratio) {
        super(name, brand, vehiclenum, speed, color, num_wheels);
        this.gearratio = gearratio;
    }

    public boolean isGeared() {
        System.out.println("The bike is geared:(gearedbike)");
        return true;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Number of wheels:" + num_wheels);
        System.out.println("gear ratio:" + gearratio);
    }
}

class vehiclemain {
    public static void main(String args[]) {
        Car c = new Car("Audi", "Q7", 8055, 350, "Dazling blue", 4);
        System.out.println("details of car");
        c.showDetails();
        gearedbike gb = new gearedbike("Royal Enfield", "Thunder bolt", 0007, 250, "Black", 2, 6);
        System.out.println("details of bike");
        System.out.println(gb.isGeared());
        gb.showDetails();
    }
}
