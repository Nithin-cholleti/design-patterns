package patterns.strategy.Vehicles;

import patterns.strategy.strategies.DrivingStrategy;

public class Vehicle {
    DrivingStrategy drivingStrategy;
    public Vehicle(DrivingStrategy drivingStrategy){
        this.drivingStrategy = drivingStrategy;
    }

    public void drive(){
        drivingStrategy.drive();
    }
}
