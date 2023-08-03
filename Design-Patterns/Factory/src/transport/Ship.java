package transport;

public class Ship implements Transport {
    public Ship() {
    }

    @Override
    public void deliver() {
        System.out.println(
                "Ship delivered"
        );
    }
}
