import transport.Ship;
import transport.Transport;
import transport.Truck;

public class TransportFactory {
    public Transport makeTransport(String transport){
        return switch (transport) {
            case "truck" -> new Truck();
            case "ship" -> new Ship();
            default -> null;
        };
    }
}
