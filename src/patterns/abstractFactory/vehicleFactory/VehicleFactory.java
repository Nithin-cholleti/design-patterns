package patterns.abstractFactory.vehicleFactory;

import patterns.abstractFactory.VehicleType;

public class VehicleFactory {

    public ComfortVehicleFactory getVehicle(VehicleType vehicleType) {
        switch (vehicleType) {
            case LUXURY:
                return new LuxuryVehicleFactory();
            case ORDINARY:
                return new OrdinaryVehicleFactory();
            default:
                return null;
        }
    }
}
