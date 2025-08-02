package patterns.abstractFactory.vehicleFactory;

import patterns.abstractFactory.vehicles.Vehicle;

public interface ComfortVehicleFactory {
    public Vehicle getVehicle(String vehicle);
}
