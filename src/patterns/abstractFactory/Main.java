package patterns.abstractFactory;

import patterns.abstractFactory.vehicleFactory.ComfortVehicleFactory;
import patterns.abstractFactory.vehicleFactory.VehicleFactory;
import patterns.abstractFactory.vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        ComfortVehicleFactory luxuryVehicles = vehicleFactory.getVehicle(VehicleType.LUXURY);
        Vehicle BMW = luxuryVehicles.getVehicle("B");
        BMW.getDetails();
        luxuryVehicles.getVehicle("M").getDetails();

        ComfortVehicleFactory ordinaryVehicles = vehicleFactory.getVehicle(VehicleType.ORDINARY);
        ordinaryVehicles.getVehicle("S").getDetails();
        ordinaryVehicles.getVehicle("H").getDetails();
    }
}
