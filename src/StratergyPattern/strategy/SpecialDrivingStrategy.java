package StratergyPattern.strategy;

public class SpecialDrivingStrategy implements DrivingStrategy {

    @Override
    public void drive() {
        System.out.println("Special Driving Strategy");
    }
}
