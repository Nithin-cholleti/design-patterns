package patterns.strategy.Vehicles;

import patterns.strategy.strategies.DrivingStrategy;
import patterns.strategy.strategies.NormalDrivingStrategy;

public class NormalVehicle  {
    private final DrivingStrategy strategy = new NormalDrivingStrategy();
    Vehicle normalVehicle = new Vehicle(strategy);

    public void drive(){
        normalVehicle.drive();
    }
}
