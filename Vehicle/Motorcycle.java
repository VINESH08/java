package vehicles;

import vehicles.*;

public class Motorcycle extends Vehicle {
    int Enginecap;

    public Motorcycle(String VIN, String model, int yearofmani, int Enginecap) {
        super(VIN, model, yearofmani);
        this.Enginecap = Enginecap;
    }

    public static boolean rentem = false;

    public static boolean isrented() {
        if (rentem == true)
            return true;
        else
            return false;
    }

    public void rent() throws RentalNotPossible {
        if (isrented()) {
            throw new RentalNotPossible("Sorry The vehicle is already rented");
        }
        rentem = true;
        System.out.println("The Motorcycle with VIN: " + VIN + " is rented");
    }

    public void returnVehicle() {
        rentem = false;
        System.out.println("The Vehicle with VIN: " + VIN + " is returned sucessfully");
    }

}
