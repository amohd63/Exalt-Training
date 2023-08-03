/*
 * This code implements Proxy pattern.
 * It controls the access of the original object.
 * Accepts only admin accesses.
 */
public class Main {
    public static void main(String[] args) {
        BookProxy bookProxy = new BookProxy(
                new Book("Testing book", 12, 5),
                "admin"
        );
        System.out.println(bookProxy.getContent());
        BookProxy bookProxy2 = new BookProxy(
                new Book("Testing book", 12, 5),
                "user"
        );
        System.out.println(bookProxy2.getContent());
    }
}