import java.util.HashSet;

public class Database {

    private HashSet<Book> database = new HashSet<>();

    public Database(HashSet<Book> database){
        this.database = database;
    }

    public HashSet<Book> getDatabase() {
        return database;
    }
}
