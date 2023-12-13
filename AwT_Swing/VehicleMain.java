import java.util.*;

class Vehicle {
    String make;
    String model;
    int year;
    int price;

    Vehicle(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    void setMake(String make) {
        this.make = make;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setPrice(int price) {
        this.price = price;
    }

    String getMake() {
        return make;
    }

    String getModel() {
        return model;
    }

    int getYear() {
        return year;
    }

    int getPrice() {
        return price;
    }

}

class PriceComparator implements Comparator<Vehicle> {
    public int compare(Vehicle obj1, Vehicle obj2) {
        return obj1.price - obj2.price;
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        ArrayList<Vehicle> al = new ArrayList<Vehicle>();
        al.add(new Vehicle("Metallic", "Sport", 2024, 400000));
        al.add(new Vehicle("Titanium", "XUV", 2023, 100000));
        al.add(new Vehicle("Carbon", "Jeep", 2224, 300000));
        System.out.println("Before Sorting");
        for (Vehicle v : al) {
            System.out.println(v.getMake() + " " + v.getModel() + " " + v.getYear() + " " + v.getPrice());
        }
        Collections.sort(al, new PriceComparator());
        System.out.println("After Sorting");
        for (Vehicle v : al) {
            System.out.println(v.getMake() + " " + v.getModel() + " " + v.getYear() + " " + v.getPrice());
        }
    }
}
