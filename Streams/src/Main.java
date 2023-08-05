import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    private static List<Order> orders = new ArrayList<>();
    private static List<Product> products = new ArrayList<>();
    private static List<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        insertData();
        System.out.println("Exercise 1");
        exercise1();
        System.out.println("\n");
        System.out.println("Exercise 2");
        exercise2();
        System.out.println("\n");
        System.out.println("Exercise 3");
        exercise3();
        System.out.println("\n");
        System.out.println("Exercise 4");
        exercise4();
        System.out.println("\n");
    }

    //Obtain a list of product with category = \"Books\" and price > 660
    public static void exercise1() {
        List<Product> result = products.stream()
                .filter(e -> e.getCategory().equals("Books") && e.getPrice() > 660)
                .collect(Collectors.toList());
        result.forEach(p -> System.out.println(p.toString()));
    }

    //Obtain a list of order with product category = \"Baby\"
    public static void exercise2() {
        List<Product> result = products.stream()
                .filter(e -> e.getCategory().equals("Baby"))
                .collect(Collectors.toList());
        result.forEach(p -> System.out.println(p.toString()));
    }

    //Obtain a list of product with category = “Toys” and then apply 10% discount\"
    public static void exercise3() {
        List<Product> result = products.stream()
                .filter(e -> e.getCategory().equals("Toys"))
                .peek(e -> e.setPrice(e.getPrice() * 0.9))
                .collect(Collectors.toList());
        result.forEach(p -> System.out.println(p.toString()));
    }

    //Get the 3 cheapest products of \"Books\" category
    public static void exercise4() {
        List<Product> result = products.stream()
                .filter(e -> e.getCategory().equals("Books"))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .limit(3)
                .collect(Collectors.toList());
        result.forEach(p -> System.out.println(p.toString()));
    }


    public static void insertData() {
        Customer customer1 = new Customer(1, "Stefan Walker", 1);
        customers.add(customer1);
        Customer customer2 = new Customer(2, "Daija Von", 1);
        customers.add(customer2);
        Customer customer3 = new Customer(3, "Ariane Rodriguez", 1);
        customers.add(customer3);
        Customer customer4 = new Customer(4, "Marques Nikolaus", 2);
        customers.add(customer4);
        Customer customer5 = new Customer(5, "Rachelle Greenfelder", 0);
        customers.add(customer5);
        Customer customer6 = new Customer(6, "Larissa White", 2);
        customers.add(customer6);
        Customer customer7 = new Customer(7, "Fae Heidenreich", 1);
        customers.add(customer7);
        Customer customer8 = new Customer(8, "Dino Will", 2);
        customers.add(customer8);
        Customer customer9 = new Customer(9, "Eloy Stroman", 1);
        customers.add(customer9);
        Customer customer10 = new Customer(10, "Brisa O'Connell", 1);
        customers.add(customer10);

        Product product1 = new Product(1, "omnis quod consequatur", "Games", 184.83);
        products.add(product1);
        Product product2 = new Product(2, "vel libero suscipit", "Toys", 12.66);
        products.add(product2);
        Product product3 = new Product(3, "non nemo iure", "Grocery", 498.02);
        products.add(product3);
        Product product4 = new Product(4, "voluptatem voluptas aspernatur", "Toys", 536.80);
        products.add(product4);
        Product product5 = new Product(5, "animi cum rem", "Games", 458.20);
        products.add(product5);
        Product product6 = new Product(6, "dolorem porro debitis", "Toys", 146.52);
        products.add(product6);
        Product product7 = new Product(7, "aspernatur rerum qui", "Books", 656.42);
        products.add(product7);
        Product product8 = new Product(8, "deleniti earum et", "Baby", 41.46);
        products.add(product8);
        Product product9 = new Product(9, "voluptas ut quidem", "Books", 697.57);
        products.add(product9);
        Product product10 = new Product(10, "eos sed debitis", "Baby", 366.90);
        products.add(product10);
        Product product11 = new Product(11, "laudantium sit nihil", "Toys", 95.50);
        products.add(product11);
        Product product12 = new Product(12, "ut perferendis corporis", "Grocery", 302.19);
        products.add(product12);
        Product product13 = new Product(13, "sint voluptatem ut", "Toys", 295.37);
        products.add(product13);
        Product product14 = new Product(14, "quos sunt ipsam", "Grocery", 534.64);
        products.add(product14);
        Product product15 = new Product(15, "qui illo error", "Baby", 623.58);
        products.add(product15);
        Product product16 = new Product(16, "aut ex ducimus", "Books", 551.39);
        products.add(product16);
        Product product17 = new Product(17, "accusamus repellendus minus", "Books", 240.58);
        products.add(product17);
        Product product18 = new Product(18, "aut accusamus quia", "Baby", 881.38);
        products.add(product18);
        Product product19 = new Product(19, "doloremque incidunt sed", "Games", 988.49);
        products.add(product19);
        Product product20 = new Product(20, "libero omnis velit", "Baby", 177.61);
        products.add(product20);
        Product product21 = new Product(21, "consectetur cupiditate sunt", "Toys", 95.46);
        products.add(product21);
        Product product22 = new Product(22, "itaque ea qui", "Baby", 677.78);
        products.add(product22);
        Product product23 = new Product(23, "non et nulla", "Grocery", 70.49);
        products.add(product23);
        Product product24 = new Product(24, "veniam consequatur et", "Books", 893.44);
        products.add(product24);
        Product product25 = new Product(25, "magnam adipisci voluptate", "Grocery", 366.13);
        products.add(product25);
        Product product26 = new Product(26, "reiciendis consequuntur placeat", "Toys", 359.27);
        products.add(product26);
        Product product27 = new Product(27, "dolores ipsum sit", "Toys", 786.99);
        products.add(product27);
        Product product28 = new Product(28, "ut hic tempore", "Toys", 316.09);
        products.add(product28);
        Product product29 = new Product(29, "quas quis deserunt", "Toys", 772.78);
        products.add(product29);
        Product product30 = new Product(30, "excepturi nesciunt accusantium", "Toys", 911.46);
        products.add(product30);

        Order order1 = new Order(1, "NEW", 5);
        orders.add(order1);
        Order order2 = new Order(2, "NEW", 3);
        orders.add(order2);
        Order order3 = new Order(3, "DELIVERED", 5);
        orders.add(order3);
        Order order4 = new Order(4, "PENDING", 3);
        orders.add(order4);
        Order order5 = new Order(5, "NEW", 1);
        orders.add(order5);
        Order order6 = new Order(6, "DELIVERED", 9);
        orders.add(order6);
        Order order7 = new Order(7, "PENDING", 8);
        orders.add(order7);
        Order order8 = new Order(8, "NEW", 4);
        orders.add(order8);
        Order order9 = new Order(9, "NEW", 10);
        orders.add(order9);
        Order order10 = new Order(10, "NEW", 8);
        orders.add(order10);

    }
}