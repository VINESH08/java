package vehicles;

import vehicles.Rentable;

public abstract class Vehicle implements Rentable {
    String VIN, model;
    int yearofmani;
    public static boolean rented = false;

    public Vehicle(String VIN, String model, int yearofmani) {
        this.VIN = VIN;
        this.model = model;
        this.yearofmani = yearofmani;
    }

    public void rent() throws RentalNotPossible {
        rented = true;
        System.out.println("The vehicle is being rented");
    }

    public void returnVehicle() {
        rented = false;
        System.out.println("The vehicle is being returned");
    }
}
