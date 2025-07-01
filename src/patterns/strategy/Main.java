package patterns.strategy;

import patterns.strategy.Vehicles.NormalVehicle;
import patterns.strategy.Vehicles.SpecialVehicle;

public class Main {
    public static void main(String[] args) {
        NormalVehicle n = new NormalVehicle();
        n.drive();
        SpecialVehicle s = new SpecialVehicle();
        s.drive();
    }
}