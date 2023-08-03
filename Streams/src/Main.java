import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static Map<User, List<Book>> database;

    public static void main(String[] args) {
        database = new HashMap<>();
        insertData();
        /*
         * First stream examples, prints all data.
         */
        System.out.println("Users & their books:");
        database.forEach((user, books) -> {
            System.out.println(user.getFirstName() + " " + user.getLastName() + ": " + books);
        });
        System.out.println("********************\n");

        /*
         * Users without books
         */
        System.out.println("Users without books:");
        List<User> usersWithoutSpecificBook = database.entrySet().stream()
                .filter(entry -> entry.getValue() == null)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        usersWithoutSpecificBook.forEach(user -> {
            System.out.println(user.getFirstName() + " " + user.getLastName());
        });
        System.out.println("********************\n");

        /*
         * Users with number of books
         */
        System.out.println("Users with number of books:");
        Map<User, Integer> userBookCountMap = database.entrySet().stream()
                .filter(entry -> entry.getValue() != null)
                .collect(Collectors.toMap(Map.Entry::getKey, e -> (Integer) e.getValue().size()));

        userBookCountMap.forEach((user, number) -> {
            System.out.println(user.getFirstName() + " " + user.getLastName() + " - " + number);
        });

        System.out.println("********************\n");

        /*
         * Users with number of books >= 2
         */

        System.out.println("Users with number of books >= 2:");
        Map<User, Integer> userBookCountGreaterThanTwo = database.entrySet().stream()
                .filter(entry -> entry.getValue() != null)
                .collect(Collectors.toMap(Map.Entry::getKey, e -> (Integer) e.getValue().size()));

        userBookCountMap.forEach((user, number) -> {
            System.out.println(user.getFirstName() + " " + user.getLastName() + " - " + number);
        });

        System.out.println("********************\n");

        boolean anyUserHasMoreThanFiveBooks = database.values().stream()



//        Book specificBook = new Book("1234A", "Ahmad Majed", "Java", "For beginners", 26);
//        System.out.println("Users with book: " + specificBook.toString());
//
//        List<User> usersWithSpecificBook = database.entrySet().stream()
//                .filter(entry -> entry.getValue() != null)
//                .filter(entry -> entry.getValue().contains(specificBook))
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//        System.out.println("********************\n");
    }

    /*
     * This method inserts data to the database
     */
    public static void insertData() {
        database.put(
                new User("Ali", "Mohammed", 26, 152),
                List.of(
                        new Book("1234A", "Ahmad Majed", "Java", "For beginners", 26),
                        new Book("2234C", "Akram Jehad", "Android", "For beginners", 25),
                        new Book("3234D", "Fadi Masri", "C++", "For beginners", 24),
                        new Book("4234B", "Lara Jabra", "Python", "For beginners", 20)
                )
        );

        database.put(
                new User("Amjad", "Mari", 20, 15),
                List.of(
                        new Book("1234A", "Ahmad Majed", "Java", "For beginners", 26),
                        new Book("4234B", "Lara Jabra", "Python", "For beginners", 20)
                )
        );

        database.put(
                new User("Fadi", "Bara", 16, 12),
                List.of(
                        new Book("3234D", "Fadi Masri", "C++", "For beginners", 24)
                )
        );

        database.put(
                new User("Tala", "Hod", 36, 1285),
                null
        );
    }
}