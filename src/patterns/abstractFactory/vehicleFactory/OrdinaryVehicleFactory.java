package patterns.abstractFactory.vehicleFactory;

import patterns.abstractFactory.vehicles.Hyundai;
import patterns.abstractFactory.vehicles.Swift;
import patterns.abstractFactory.vehicles.Vehicle;

public class OrdinaryVehicleFactory implements ComfortVehicleFactory {

    @Override
    public Vehicle getVehicle(String vehicle){
        return switch (vehicle) {
            case "S" -> new Swift();
            case "H" -> new Hyundai();
            default -> null;
        };
    }
}
