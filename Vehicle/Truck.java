package vehicles;

import vehicles.*;

public class Truck extends Vehicle {
    int cargoCapacity;

    public Truck(String VIN, String model, int yearofmani, int cargoCapacity) {
        super(VIN, model, yearofmani);
        this.cargoCapacity = cargoCapacity;
    }

    public static boolean renttru = false;

    public static boolean isrented() {
        if (renttru == true)
            return true;
        else
            return false;
    }

    public void rent() throws RentalNotPossible {
        if (isrented()) {
            throw new RentalNotPossible("Sorry The vehicle is already rented");
        }
        renttru = true;
        System.out.println("The Truck with VIN: " + VIN + " is rented");
    }

    public void returnVehicle() {
        renttru = false;
        System.out.println("The Vehicle with VIN: " + VIN + " is returned sucessfully");
    }

}
