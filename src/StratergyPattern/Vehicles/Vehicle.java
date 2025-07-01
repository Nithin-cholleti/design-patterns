package StratergyPattern.Vehicles;

import StratergyPattern.strategy.DrivingStrategy;

public class Vehicle {
    DrivingStrategy drivingStrategy;
    public Vehicle(DrivingStrategy drivingStrategy){
        this.drivingStrategy = drivingStrategy;
    }

    public void drive(){
        drivingStrategy.drive();
    }
}
