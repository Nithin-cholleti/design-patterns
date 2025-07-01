package StratergyPattern.Vehicles;

import StratergyPattern.strategy.DrivingStrategy;
import StratergyPattern.strategy.NormalDrivingStrategy;

public class NormalVehicle  {
    private final DrivingStrategy strategy = new NormalDrivingStrategy();
    Vehicle normalVehicle = new Vehicle(strategy);

    public void drive(){
        normalVehicle.drive();
    }
}
