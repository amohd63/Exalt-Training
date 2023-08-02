public class Database {
    
    private static Database databaseInstance;

    private Database() {

    }

    public static Database getInstance() {
        if (Database.databaseInstance == null) {
            Database.databaseInstance = new Database();
        }
        return Database.databaseInstance;
    }
}