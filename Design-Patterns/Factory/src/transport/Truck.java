package transport;

public class Truck implements Transport {
    public Truck() {
    }

    @Override
    public void deliver() {
        System.out.println(
                "Truck delivered"
        );
    }
}
