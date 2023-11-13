import java.util.HashSet;
import java.util.Set;

public class Database {

    private Set<Product> database = new HashSet<>();

    public Database(HashSet<Product> database){
        this.database = database;
    }

    public Set<Product> getDatabase() {
        return database;
    }

    public void setDatabase(HashSet<Product> database) {
        this.database = database;
    }
}
