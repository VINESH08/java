package vehicles;

import vehicles.*;

public class Car extends Vehicle {
    int numDoors;

    public Car(String VIN, String model, int yearofmani, int numDoors) {
        super(VIN, model, yearofmani);
        this.numDoors = numDoors;
    }

    public static boolean isrented() {
        if (rented == true)
            return true;
        else
            return false;
    }

    public void rent() throws RentalNotPossible {
        if (isrented()) {
            throw new RentalNotPossible("Sorry The vehicle is already rented");
        }
        rented = true;
        System.out.println("The car with VIN: " + VIN + " is rented");
    }

    public void returnVehicle() {
        rented = false;
        System.out.println("The Vehicle with VIN: " + VIN + " is returned sucessfully");
    }

}
