package patterns.strategy.Vehicles;

import patterns.strategy.strategies.DrivingStrategy;
import patterns.strategy.strategies.SpecialDrivingStrategy;

public class SpecialVehicle {
    private final DrivingStrategy strategy = new SpecialDrivingStrategy();
    Vehicle specialVehicle = new Vehicle(strategy);

    public void drive(){
        specialVehicle.drive();
    }
}
