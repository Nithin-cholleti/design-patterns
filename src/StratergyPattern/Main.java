package StratergyPattern;

import StratergyPattern.Vehicles.NormalVehicle;
import StratergyPattern.Vehicles.SpecialVehicle;

public class Main {
    public static void main(String[] args) {
        NormalVehicle n = new NormalVehicle();
        n.drive();
        SpecialVehicle s = new SpecialVehicle();
        s.drive();
    }
}