package StratergyPattern.strategy;

public class NormalDrivingStrategy implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("normal driving");
    }
}
