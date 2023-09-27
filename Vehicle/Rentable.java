package vehicles;

public interface Rentable {
    void rent() throws RentalNotPossible;

    void returnVehicle();
}