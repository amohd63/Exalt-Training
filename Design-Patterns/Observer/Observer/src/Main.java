public class Main {
    public static void main(String[] args) {
        Observer customer1 = new Customer("Ali");
        Observer customer2 = new Customer("Mohammed");
        Subject subject = new ShoppingSubject();
        subject.addObserver(customer1);
        subject.addObserver(customer2);
        subject.notifyObserver("Sprite is available in our shop!");
    }
}