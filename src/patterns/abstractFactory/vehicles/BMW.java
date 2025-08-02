package patterns.abstractFactory.vehicles;

public class BMW implements Vehicle {
    @Override
    public void getDetails() {
        System.out.println("BMW - Luxury");
    }
}
