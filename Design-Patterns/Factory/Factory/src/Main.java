import transport.Ship;
import transport.Truck;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();
        Truck truckInstance = (Truck) transportFactory.makeTransport("truck");
        Ship shipInstance = (Ship) transportFactory.makeTransport("ship");
        truckInstance.deliver();
        shipInstance.deliver();
    }
}