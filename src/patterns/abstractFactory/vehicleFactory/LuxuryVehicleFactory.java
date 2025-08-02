package patterns.abstractFactory.vehicleFactory;

import patterns.abstractFactory.vehicles.BMW;
import patterns.abstractFactory.vehicles.Mercedes;
import patterns.abstractFactory.vehicles.Vehicle;

public class LuxuryVehicleFactory implements ComfortVehicleFactory {

    @Override
    public Vehicle getVehicle(String vehicle){
        switch (vehicle){
            case "B" : return new BMW();
            case "M" : return new Mercedes();
            default: return  null;
        }
    }
}
