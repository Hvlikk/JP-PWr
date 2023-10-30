import java.util.TreeMap;

public class Database {

    private TreeMap<String, Integer> database = new TreeMap<>();

    public Database(TreeMap<String, Integer> database){
        this.database = database;
    }

    public TreeMap<String, Integer> getDatabase() {
        return database;
    }

    public void setDatabase(TreeMap<String, Integer> database) {
        this.database = database;
    }
}