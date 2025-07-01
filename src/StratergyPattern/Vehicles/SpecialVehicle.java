package StratergyPattern.Vehicles;

import StratergyPattern.strategy.DrivingStrategy;
import StratergyPattern.strategy.SpecialDrivingStrategy;

public class SpecialVehicle {
    private final DrivingStrategy strategy = new SpecialDrivingStrategy();
    Vehicle specialVehicle = new Vehicle(strategy);

    public void drive(){
        specialVehicle.drive();
    }
}
