import java.util.HashSet;

public class Database {

     private HashSet<Product> database = new HashSet<>();

    public Database(HashSet<Product> database){
        this.database = database;
    }

    public HashSet<Product> getDatabase() {
        return database;
    }

    public void setDatabase(HashSet<Product> database) {
        this.database = database;
    }
}
