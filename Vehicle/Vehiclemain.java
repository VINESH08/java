package vehicles;

import vehicles.*;
import java.util.*;

import vehicles.RentalNotPossible;

public class Vehiclemain {
    public static void main(String args[]) {
        try {
            Scanner in = new Scanner(System.in);
            String vin, model;
            int yom;
            int choice;
            System.out.println("Enter the Vehicle identity number: ");
            vin = in.next();
            System.out.println("Enter the Model of the vehicle");
            model = in.next();
            System.out.println("Enter the year of manufacture:");
            yom = in.nextInt();
            do {

                // int choice;
                System.out.println("Enter the vehicle type..to be rented");
                System.out.println("1.Car 2.Motorcycle 3.Truck");

                choice = in.nextInt();
                System.out.println("Enter the mode: 4.rent 5.return");
                int choice2 = in.nextInt();
                switch (choice) {
                    case 1:

                        System.out.println("Enter the number of doors");
                        int door = in.nextInt();
                        Car car = new Car(vin, model, choice, door);
                        if (choice2 == 4)
                            car.rent();
                        else if (choice2 == 5)
                            car.returnVehicle();
                        break;
                    case 2:

                        System.out.println("Enter the Engine capacity");
                        int Enginecap = in.nextInt();
                        Motorcycle mc = new Motorcycle(vin, model, yom, Enginecap);
                        if (choice2 == 4)
                            mc.rent();
                        else if (choice2 == 5)
                            mc.returnVehicle();
                        break;
                    case 3:

                        System.out.println("Enter the cargocapacity");
                        int cargocap = in.nextInt();
                        Truck truck = new Truck(vin, model, yom, cargocap);
                        if (choice2 == 4)
                            truck.rent();
                        else if (choice2 == 5)
                            truck.returnVehicle();
                        break;

                }
            } while (choice != 0);
        } catch (RentalNotPossible e) {
            System.out.println(e);
        }
    }
}
