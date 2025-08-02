package patterns.abstractFactory.vehicles;

public class Mercedes implements Vehicle {
    @Override
    public void getDetails() {
        System.out.println("Mercedes - Luxury");
    }
}
